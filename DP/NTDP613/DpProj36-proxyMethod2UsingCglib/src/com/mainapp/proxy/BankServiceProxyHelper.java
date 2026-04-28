package com.mainapp.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class BankServiceProxyHelper implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("BankServiceProxyHelper.intercept()- helper for dynamic proxy class");
		if(method.getName().equalsIgnoreCase("withdraw")) {
			if (((Float)args[1])<=4000) {
				Object invokeSuper = proxy.invokeSuper(obj, args);
				return invokeSuper;
			} else
				throw new IllegalArgumentException("u can't withdraw more than 4000 in the period of demonitorization");
			} else {
				Object invokeSuper = proxy.invokeSuper(obj, args);
				return invokeSuper;
		}
	}
}
