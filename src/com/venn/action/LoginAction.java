package com.venn.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.venn.bean.User;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
	
	private User user = new User();
	public String login(){
		
		System.out.println("username = " + user.getUsername());
		System.out.println("password = " + user.getPassword());
		for (String book : user.getBookList()) {
			System.out.println("book = " + book);
		}
		Map session = ActionContext.getContext().getSession();
		session.put("user.username", user.getUsername());
		return SUCCESS;
	}
	@Override
	public User getModel() {
		return user;
	}
}
