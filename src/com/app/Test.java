package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext c=new ClassPathXmlApplicationContext("config.xml");
	Employee e=(Employee)c.getBean("empObj");
	e.getMsg();
	e.getString();
	System.out.println(e.getwelcome());
}
}
