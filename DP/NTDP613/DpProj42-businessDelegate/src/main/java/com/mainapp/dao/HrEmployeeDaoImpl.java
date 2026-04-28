package com.mainapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mainapp.bo.EmployeeBo;
import com.mainapp.bo.HrEmployeeBo;

public class HrEmployeeDaoImpl implements EmployeeDao {

    private static final String INSERT_HR_EMP =
            "INSERT INTO BUSINESS_DELEGATE_HR_EMP(ENO, ENAME, DESG, ADDRS) VALUES(?, ?, ?, ?)";

    @Override
    public int insert(EmployeeBo bo, Connection con) throws SQLException {
        int result = 0;

        try (PreparedStatement ps = con.prepareStatement(INSERT_HR_EMP)) {
            ps.setInt(1, bo.getEno());
            ps.setString(2, bo.getEname());
            ps.setString(3, ((HrEmployeeBo) bo).getDesg());
            ps.setString(4, bo.getAddrs());

            result = ps.executeUpdate();
        }

        return result;
    }
}