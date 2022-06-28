package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
Student student1=(Student) context.getBean("student1");
System.out.println(student1.getName());
System.out.println(student1.getPhones());
System.out.println(student1.getAdrress());
System.out.println(student1.getCourse());
int num=context.getBeanDefinitionCount();
System.out.println(num);
}
}
