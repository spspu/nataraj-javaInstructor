package com.mainapp.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodProxy;

public interface MethodInterceptor {
	
	public Object intercept(Object obj,Method method,Object[] args,MethodProxy proxy) throws Throwable;

}
