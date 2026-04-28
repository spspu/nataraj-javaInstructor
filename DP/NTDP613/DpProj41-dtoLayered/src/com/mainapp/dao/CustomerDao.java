package com.mainapp.dao;

import java.sql.SQLException;

import com.mainapp.model.Customer;

public interface CustomerDao {
	public int insertCustomer(Customer customer) throws SQLException, Exception;

}
