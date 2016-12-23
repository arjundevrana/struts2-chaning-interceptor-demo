package com.arjun.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class PrintMsgInterceptorFour implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2904692780513491878L;

	public void destroy() {
		System.out.println("CustomInterceptorFour destroy() is called...");
	}

	public void init() {
		System.out.println("CustomInterceptorFour init() is called...");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		//int  i=0;
		System.out.println("CustomInterceptorFour, before invocation.invoke()...");
		/*if(i<1){
			return "helloAction";	
		}*/
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptorFour, after invocation.invoke()...");
		
		return result;
	}
		
}