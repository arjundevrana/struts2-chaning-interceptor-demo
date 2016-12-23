package com.arjun.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class PrintMsgInterceptorThird implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6310794755632853762L;

	public void destroy() {
		System.out.println("CustomInterceptorThird destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptorThird init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		
		System.out.println("CustomInterceptorThird, before invocation.invoke()...");
		
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptorThird, after invocation.invoke()...");
		
		return result;
	}
		
}