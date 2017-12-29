package com.app;

public class Employee {
	private String name;
	private int type;

	public String getName() {
		System.out.println("In-Employee-In-getName():String");
		return name;
	}

	public String getName(int id) {
		System.out.println("In-Employee-In-getName(int):String");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		System.out.println("In-Employee-In-getType():int");
		return type;
	}

	public int getType(int id) {
		System.out.println("In-Employee-In-getType(int):int");
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
