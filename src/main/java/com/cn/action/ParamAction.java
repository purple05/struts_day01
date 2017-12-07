package com.cn.action;

public class ParamAction {
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public String execute(){
		System.out.println(name);
		return "success";
	}
}
