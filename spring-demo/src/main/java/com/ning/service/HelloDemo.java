package com.ning.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		FirstService firstService = (FirstService) context.getBean("firstService");
		firstService.printName("ningjian");
	}
}
