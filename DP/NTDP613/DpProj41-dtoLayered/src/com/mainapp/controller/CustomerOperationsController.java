package com.mainapp.controller;

import com.mainapp.model.Customer;
import com.mainapp.service.CustomerMgmtService;
import com.mainapp.service.CustomerMgmtServiceImpl;

public class CustomerOperationsController {

    private CustomerMgmtService service;

    public CustomerOperationsController() {
        service = new CustomerMgmtServiceImpl();
    }

    public String processCustomerForRegistration(Customer customer) throws Exception {
        return service.registerCustomer(customer);
    }
}