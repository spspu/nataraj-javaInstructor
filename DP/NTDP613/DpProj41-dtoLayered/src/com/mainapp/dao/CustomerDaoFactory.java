package com.mainapp.dao;

public class CustomerDaoFactory {

    public static CustomerDao getInstance(String type) {

        if ("jdbc".equalsIgnoreCase(type)) {
            return new CustomerDaoJdbcImpl();
        }

        throw new IllegalArgumentException("Invalid DAO type: " + type);
    }
}