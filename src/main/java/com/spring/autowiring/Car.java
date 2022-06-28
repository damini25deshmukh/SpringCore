package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
String company;
String carName;
//@Autowired
Engine engine;

public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getCarName() {
	return carName;
}
public void setCarName(String carName) {
	this.carName = carName;
}
public Engine getEngine() {
	return engine;
}

//@Autowired
public void setEngine(Engine engine) {
	
	this.engine = engine;
}
public Car() {
}

public Car(String company, String carName) {
	this.company = company;
	this.carName = carName;
}
@Autowired
public Car(Engine engine) {
	System.out.println("All arg constructer ");
	this.engine = engine;
}
@Override
public String toString() {
	return "Car [company=" + company + ", carName=" + carName + ", engine=" + engine + "]";
}

}

