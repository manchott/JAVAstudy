package com.ssafy.abstractclass2;

public abstract class Chef {
	String name;
	int age;
	String speciality;
	
	public void eat() {
		System.out.println("������ �Դ´�.");
	}
	
	public abstract void cook();

}
