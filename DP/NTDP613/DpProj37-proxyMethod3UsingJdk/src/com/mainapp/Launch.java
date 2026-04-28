package com.mainapp;

import java.util.Arrays;

import com.mainapp.factory.BankServiceFactory;
import com.mainapp.real.BankService;

public class Launch {
	public static void main(String[] args) {
		//During Demonitorization
		try {
			BankService service=BankServiceFactory.getInsatnce(true);
			System.out.println("service object class name:: "+service.getClass().getName()+"----"+service.getClass().getSuperclass());
			System.out.println("implemented interfaces:: "+Arrays.toString(service.getClass().getInterfaces()));
			String result=service.withdraw(133554L, 56789.0f);	//More than 4000
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=====================================");
		//During Demonitorization
		try {
			BankService service=BankServiceFactory.getInsatnce(true);
			System.out.println("service object class name:: "+service.getClass().getName());
			String result=service.withdraw(133554L, 2000.0f);	//Less than 4000
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//During Normal Days
		System.out.println("====================================");
		try {
			BankService service=BankServiceFactory.getInsatnce(false);
			System.out.println("service object class name:: "+service.getClass().getName());
			String result=service.withdraw(133554L, 12000.0f);	//More than 4000
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}




