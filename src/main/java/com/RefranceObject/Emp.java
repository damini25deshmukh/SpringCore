package com.RefranceObject;

public class Emp {
private int id;
private String name;
private Address address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int id, String name, Address address) {
	this.id = id;
	this.name = name;
	this.address = address;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
}

}
