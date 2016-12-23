package com.arjun.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class PrintMsgInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4091784041793019057L;

	public void destroy() {
		System.out.println("CustomInterceptor destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptor init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("CustomInterceptor, before invocation.invoke()...");
		
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptor, after invocation.invoke()...");
		
		return result;
	}
		
}