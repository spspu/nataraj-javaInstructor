package com.mainapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mainapp.model.Customer;

public class CustomerDaoJdbcImpl implements CustomerDao {
//	CREATE TABLE DAO_CUSTOMER11 (
//    cid INT AUTO_INCREMENT PRIMARY KEY,
//    cname VARCHAR(50),
//    cadd VARCHAR(100),
//    bill_amt FLOAT
//);
    private static final String INSERT_CUSTOMER_QUERY =
            "INSERT INTO DAO_CUSTOMER11(cname, cadd, bill_amt) VALUES(?, ?, ?)";

    @Override
    public int insertCustomer(Customer customer) throws Exception {
        int result = 0;

        try (
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(INSERT_CUSTOMER_QUERY)
        ) {
            ps.setString(1, customer.getCname());
            ps.setString(2, customer.getCadd());
            ps.setFloat(3, customer.getBillAmt());

            result = ps.executeUpdate();
        }

        return result;
    }
}