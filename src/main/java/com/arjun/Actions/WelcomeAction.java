package com.arjun.Actions;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public String execute() throws Exception {
		
		System.out.println("Welcome Action execute() is called");
		
		return SUCCESS;
		
	}
}
