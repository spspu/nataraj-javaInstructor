package com.mainapp.proxy;

import com.mainapp.real.BankService;
import com.mainapp.real.BankServiceImpl;

public class BankServiceProxy implements BankService{
	
	private BankService real=null;
	public BankServiceProxy() {
		real=new BankServiceImpl();
	}

	@Override
	public String withdraw(long acno, float amount) {
		System.out.println("BankServiceProxy.withdraw()- proxy class");
		String result=null;
		if(amount<=4000)
			result=real.withdraw(acno, amount);
		else
			throw new IllegalArgumentException("you can't withdraw more than 4000 during the demonitorization");
		return result;
	}

}
