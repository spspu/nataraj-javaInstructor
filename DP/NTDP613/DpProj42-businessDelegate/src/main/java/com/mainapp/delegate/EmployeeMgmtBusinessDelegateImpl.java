package com.mainapp.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.mainapp.bo.FinanceEmployeeBo;
import com.mainapp.bo.HrEmployeeBo;
import com.mainapp.dao.EmployeeDao;
import com.mainapp.dao.FinanceEmployeeDaoImpl;
import com.mainapp.dao.HrEmployeeDaoImpl;
import com.mainapp.exception.InternalProblemException;
import com.mainapp.factory.ConnectionFactory;
import com.mainapp.vo.EmployeeVo;

//CREATE TABLE BUSINESS_DELEGATE_HR_EMP (
//	    ENO INT AUTO_INCREMENT PRIMARY KEY,
//	    ENAME VARCHAR(20),
//	    DESG VARCHAR(20),
//	    ADDRS VARCHAR(20)
//	);
//CREATE TABLE BUSINESS_DELEGATE_FINANCE_EMP (
//	    ENO INT AUTO_INCREMENT PRIMARY KEY,
//	    ENAME VARCHAR(20),
//	    SALARY INT,
//	    ADDRS VARCHAR(20)
//	);
public class EmployeeMgmtBusinessDelegateImpl implements EmployeeMgmtBusinessDelegate {
	private EmployeeDao hrDao, finanaceDao;

	public EmployeeMgmtBusinessDelegateImpl() {
		hrDao = new HrEmployeeDaoImpl();
		finanaceDao = new FinanceEmployeeDaoImpl();
	}

	@Override
	public String registerEmployee(EmployeeVo vo) throws InternalProblemException {

		int eno = (int) (System.currentTimeMillis() % 100000);

		HrEmployeeBo ebo = new HrEmployeeBo();
		ebo.setEno(eno);
		ebo.setEname(vo.getEname());
		ebo.setDesg(vo.getDesg());
		ebo.setAddrs(vo.getAddrs());

		FinanceEmployeeBo fbo = new FinanceEmployeeBo();
		fbo.setEno(eno);
		fbo.setEname(vo.getEname());
		fbo.setAddrs(vo.getAddrs());
		fbo.setSalary(Double.parseDouble(vo.getSalary()));

		boolean flag = false;
		Connection con = null;
		String resultMsg = null;

		try {
			con = ConnectionFactory.getPooledConnection();
			con.setAutoCommit(false);

			int result1 = finanaceDao.insert(fbo, con);
			int result2 = hrDao.insert(ebo, con);

			flag = result1 == 1 && result2 == 1;
		} catch (SQLException se) {
			flag = false;
			se.printStackTrace();
			throw new InternalProblemException("Some DB Problem occurred");
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
			throw new InternalProblemException("Unknown Problem is raised");
		} finally {
			try {
				if (con != null) {
					if (flag) {
						con.commit();
						resultMsg = "Employee Registration successful --- Transaction committed";
					} else {
						con.rollback();
						resultMsg = "Employee Registration failed --- Transaction rolled back";
					}
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}

			try {
				ConnectionFactory.closeConnection(con);
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

		return resultMsg;
	}
}// class