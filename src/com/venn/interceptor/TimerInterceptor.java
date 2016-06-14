package com.venn.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		//1. before execute action
		long start = System.currentTimeMillis();
		//2. execute next interceptor until execute action, and execute action
//		String result = invocation.invoke();
//		String result = invocation.invokeActionOnly();
		//3. after execute action, and get the current time
		long end = System.currentTimeMillis();
		
		Map session=ActionContext.getContext().getSession();
		if( session.get("user.username") != null){
			return invocation.invoke();
		}
		System.out.println(end-start);
		return "checkLoginFail";
	}

}
