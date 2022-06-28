package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private String name;
private List<String> phones;
private Set<String>adrress;
private Map<String,String>course;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAdrress() {
	return adrress;
}
public void setAdrress(Set<String> adrress) {
	this.adrress = adrress;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(String name, List<String> phones, Set<String> adrress, Map<String, String> course) {
	this.name = name;
	this.phones = phones;
	this.adrress = adrress;
	this.course = course;
}
@Override
public String toString() {
	return "Student [name=" + name + ", phones=" + phones + ", adrress=" + adrress + ", course=" + course + "]";
}

}
