package com.ssafy.polymorphism1;

public class Person {
	private String name;
	private int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("������ �Դ´�.");
	}
	
}
