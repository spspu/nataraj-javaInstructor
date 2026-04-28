package com.mainapp.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.mainapp.bo.EmployeeBo;

public interface EmployeeDao {
	public int insert(EmployeeBo bo, Connection con) throws SQLException;

}
