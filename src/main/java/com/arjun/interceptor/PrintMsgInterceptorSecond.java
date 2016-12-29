package com.arjun.interceptor;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.opensymphony.xwork2.ActionContext;
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
		 final ActionContext context = invocation.getInvocationContext();
		 Map<String, Object>  parameters =ActionContext.getContext().getParameters();
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
		    System.out.println("Inside second interceptor"+parameters.toString());
		    
		
		    Map<String, Object> parametersCopy = new TreeMap<String, Object>(
		            String.CASE_INSENSITIVE_ORDER);
		    parametersCopy.putAll(parameters);
		    parametersCopy.put("CUSTOMPARAMETER", "Custom arjun singh.");
		    context.put(ActionContext.PARAMETERS, parametersCopy);
		System.out.println("CustomInterceptorSecond, before invocation.invoke()...");
		
		String result = invocation.invoke();
		
		System.out.println("CustomInterceptorSecond, after invocation.invoke()...");
		
		return result;
	}
		
}