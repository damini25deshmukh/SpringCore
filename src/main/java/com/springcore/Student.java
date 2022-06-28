package com.springcore;

public class Student {
private int StuentId;
private String Stuentname;
private String StuentAddress;
public int getStuentId() {
	return StuentId;
}
public void setStuentId(int stuentId) {
	StuentId = stuentId;
}
public String getStuentname() {
	return Stuentname;
}
public void setStuentname(String stuentname) {
	Stuentname = stuentname;
}
public String getStuentAddress() {
	return StuentAddress;
}
public void setStuentAddress(String stuentAddress) {
	StuentAddress = stuentAddress;
}
public Student() {
	super();
}
public Student(int stuentId, String stuentname, String stuentAddress) {
	super();
	StuentId = stuentId;
	Stuentname = stuentname;
	StuentAddress = stuentAddress;
}
@Override
public String toString() {
	return "Student [StuentId=" + StuentId + ", Stuentname=" + Stuentname + ", StuentAddress=" + StuentAddress + "]";
}
}