package com.lessons.spring.core;

public class BeanConstructor {

	private String beanMessage;
	
	BeanConstructor(String beanMessage){
		this.beanMessage=beanMessage;
	}
	
	public String getBeanMessage() {
		return beanMessage;
	}
}
