package com.arjun.Actions;


import java.util.Map;
import java.util.Map.Entry;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute(){
		ActionContext context = ActionContext.getContext();
		@SuppressWarnings("unchecked")
		Map<String,Object> parameters = (Map<String,Object>)context.get(ActionContext.PARAMETERS);
		 String value = null;
		    for ( Entry<String, Object> entry : parameters.entrySet()) {
		        String key =  entry.getKey();
		        Object obj =entry.getValue() ;
		        if (obj instanceof String[]) {
		            String[] strArray = (String[]) obj;
		            value = strArray[0];
		        }
		       
		        System.out.println(key+":"+value);
		    }
		return SUCCESS;
		
	}

}
