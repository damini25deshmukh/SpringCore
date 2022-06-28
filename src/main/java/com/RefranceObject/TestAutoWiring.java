package com.RefranceObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiring {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/RefranceObject/applicationcontextref.xml");
	Emp emp=(Emp) context.getBean("emp");
	System.out.println(emp);
}
}
