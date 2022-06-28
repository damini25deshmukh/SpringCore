package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/autowiring/applicationcontextref.xml");
     Car car=(Car)context.getBean("car");
     System.out.println(car);
}
}
