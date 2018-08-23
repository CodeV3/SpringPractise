package com.lessons.spring.core;

public class BeanLifeCycle {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	public void init() {
		System.out.println("I(BeanLifeCycle) just got Intialized. ");
	}
	
	public void destroy() {
		System.out.println("Bye Bye BeanLifeCycle !!! ");
	}
	
}
