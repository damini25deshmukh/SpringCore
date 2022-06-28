package com.spring.autowiring;

public class Engine {
 String engineType;
 float enginecapacity;
 
 public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	this.engineType = engineType;
}
public float getEnginecapacity() {
	return enginecapacity;
}
public void setEnginecapacity(float enginecapacity) {
	this.enginecapacity = enginecapacity;
}
public Engine() {
}
public Engine(String engineType, float enginecapacity) {
	super();
	this.engineType = engineType;
	this.enginecapacity = enginecapacity;
}
@Override
public String toString() {
	return "Engine [engineType=" + engineType + ", enginecapacity=" + enginecapacity + "]";
}
}