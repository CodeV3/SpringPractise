package com.lessons.spring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean(name="beanConstructor")
	public BeanConstructor getHelloWorld() {
		return new BeanConstructor("Hi Mr.Bean");
	}

}
