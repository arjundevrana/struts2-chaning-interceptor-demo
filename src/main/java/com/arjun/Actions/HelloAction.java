package com.arjun.Actions;

import org.apache.struts2.ServletActionContext;

import com.arjun.model.UserInfo;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
 
public class HelloAction implements Action,ModelDriven<UserInfo>{

	UserInfo userInfo =new UserInfo();
	public String execute() throws Exception {
		System.out.println(ServletActionContext.getContext().getSession().get("interceptorNmae").toString());
		System.out.println("HelloAction execute() is called");
		return SUCCESS;	
	}
	@Override
	public UserInfo getModel() {
		return userInfo;
	}
}