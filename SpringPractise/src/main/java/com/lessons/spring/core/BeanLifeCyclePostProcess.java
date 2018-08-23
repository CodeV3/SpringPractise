package com.lessons.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanLifeCyclePostProcess implements BeanPostProcessor {
	
	   public Object postProcessBeforeInitialization(Object bean, String beanName) 
			      throws BeansException {
		   
		   System.out.println("Before Initialization with BeanPostProcess implemention.");
		   
		   return bean;
		   
	   }
	   
	   public Object postProcessAfterInitialization(Object bean, String beanName) 
			      throws BeansException {
		   System.out.println("After Initialization with BeanPostProcess implemention.");
		   return bean;
		   
	   }
	   

}
