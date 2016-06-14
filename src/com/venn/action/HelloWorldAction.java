package com.venn.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("execute method");
		return "success";
	}
	public String  login() {
		return "login";
	}
	public String add(){
		System.err.println("add method");
		return "add";
	}
	
	public String update(){
		System.out.println("update method");
		return "update";
	}
}
