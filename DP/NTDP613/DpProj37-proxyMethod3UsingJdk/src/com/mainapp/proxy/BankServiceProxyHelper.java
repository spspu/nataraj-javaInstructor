package com.mainapp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.mainapp.real.BankService;
import com.mainapp.real.BankServiceImpl;

public class BankServiceProxyHelper implements InvocationHandler{
	
	BankService real=null;
	public BankServiceProxyHelper(){
		real=new BankServiceImpl();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object retVal=null;
		if(method.getName().equalsIgnoreCase("withdraw")) {
			if (((Float)args[1])<=4000)
				method.invoke(real, args);
			else
				throw new IllegalArgumentException("u can't withdraw more than 4000 in the period of demonitorization");
			} 
		return retVal;
	}
}
