package com.mainapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mainapp.bo.EmployeeBo;
import com.mainapp.bo.FinanceEmployeeBo;

public class FinanceEmployeeDaoImpl implements EmployeeDao {

    private static final String INSERT_FINANCE_EMP =
            "INSERT INTO BUSINESS_DELEGATE_FINANCE_EMP(ENO, ENAME, SALARY, ADDRS) VALUES(?, ?, ?, ?)";

    @Override
    public int insert(EmployeeBo bo, Connection con) throws SQLException {
        int result = 0;

        try (PreparedStatement ps = con.prepareStatement(INSERT_FINANCE_EMP)) {
            ps.setInt(1, bo.getEno());
            ps.setString(2, bo.getEname());
            ps.setDouble(3, ((FinanceEmployeeBo) bo).getSalary());
            ps.setString(4, bo.getAddrs());

            result = ps.executeUpdate();
        }

        return result;
    }
}