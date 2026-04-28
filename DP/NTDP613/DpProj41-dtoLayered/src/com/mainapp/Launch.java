package com.mainapp;

import java.sql.SQLException;
import java.util.Scanner;

import com.mainapp.controller.CustomerOperationsController;
import com.mainapp.model.Customer;

public class Launch {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter customer name: ");
		String name=sc.next();
		System.out.println("enter customer address: ");
		String addrs=sc.next();
		System.out.println("enter customer bill amount: ");
		float amount=sc.nextFloat();
		
		Customer cust=new Customer();
		cust.setCname(name);
		cust.setCadd(addrs);
		cust.setBillAmt(amount);
		
		CustomerOperationsController controller=new CustomerOperationsController();
		try {
			String resultMsg=controller.processCustomerForRegistration(cust);
			System.out.println(resultMsg);
		} catch (SQLException se) {
			System.out.println(se.getMessage()+" Problem is raised");
			se.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage()+" problem is raised");
			e.printStackTrace();
		}
		
	}

}
