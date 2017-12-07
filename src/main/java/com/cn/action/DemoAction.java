package com.cn.action;

public class DemoAction {
	public String execute(){
		System.out.println("come in");
		return "msg";
	}
	
	public String test(){
		System.out.println("test()");
		return "success";
	}
}
