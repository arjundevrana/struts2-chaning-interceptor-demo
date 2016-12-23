package com.arjun.Actions;

import com.opensymphony.xwork2.ActionSupport;
 
public class HelloAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3499870330108306329L;

	public String execute() throws Exception {
		
		System.out.println("HelloAction execute() is called");
		
		return SUCCESS;
		
	}
}