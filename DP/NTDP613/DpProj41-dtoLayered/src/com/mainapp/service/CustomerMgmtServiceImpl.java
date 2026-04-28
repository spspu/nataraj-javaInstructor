package com.mainapp.service;

import com.mainapp.dao.CustomerDao;
import com.mainapp.dao.CustomerDaoFactory;
import com.mainapp.model.Customer;

public class CustomerMgmtServiceImpl implements CustomerMgmtService{
	private CustomerDao dao;
	public CustomerMgmtServiceImpl() {
		dao=CustomerDaoFactory.getInstance("jdbc");
	}
	@Override
	public String registerCustomer(Customer customer) throws Exception {
		float billAmt=customer.getBillAmt()+(customer.getBillAmt()*0.18f);
		int count=dao.insertCustomer(customer);
		return count==0?"Customer not registered":"Customer registered";
	}

}
