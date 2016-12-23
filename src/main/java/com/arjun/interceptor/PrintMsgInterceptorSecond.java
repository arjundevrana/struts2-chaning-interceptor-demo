package com.arjun.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class PrintMsgInterceptorSecond implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6698509967444023156L;

	public void destroy() {
		System.out.println("CustomInterceptorSecond destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptorSecond init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("CustomInterceptorSecond, before invocation.invoke()...");
		
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptorSecond, after invocation.invoke()...");
		
		return result;
	}
		
}