package com.mainapp.real;

public class BankServiceImpl implements BankService{

	@Override
	public String withdraw(long acno, float amount) {
		System.out.println("BankServiceImpl.withdraw()");
		return "withdrawing amount:: "+amount+" from "+acno;
	}

}
