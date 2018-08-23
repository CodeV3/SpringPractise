package com.lessons.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	
	public static void main(String args[]) {
		//ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hello = (HelloWorld)context.getBean("helloWorld");
		hello.getMessage();
		
		BeanConstructor hiBean=(BeanConstructor)context.getBean("hiBean");
		System.out.println(hiBean.getBeanMessage());
		
		BeanScope beanScope=(BeanScope)context.getBean("beanScope");
		beanScope.setMessage("My Bean Scope !!!");
		System.out.println("Bean Scope Singleton : "+beanScope.getMessage());
		
		BeanScope beanScope_1=(BeanScope)context.getBean("beanScope");
		System.out.println("Bean Scope Prototype : "+beanScope_1.getMessage());
		
		BeanLifeCycle beanLife=(BeanLifeCycle)context.getBean("beanlife");
		System.out.println(beanLife.getMessage());
		
		
		InnerBeanTextEditor textEditor = (InnerBeanTextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
		
		CollectionInSpring javaCollection = (CollectionInSpring)context.getBean("javaCollection");
		javaCollection.getAddressList();
		javaCollection.getAddressMap();
		javaCollection.getAddressSet();
		javaCollection.getAddressProp();
		
		context.registerShutdownHook();
	}
}
