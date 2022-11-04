package com.ssafy.collection;

import java.util.Objects;

public class Person {
	String name;
	String pNum;
	
	public Person() {
		
	}

	public Person(String name, String pNum) {
		this.name = name;
		this.pNum = pNum;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", pNum=" + pNum;
	}
	
	// Set�� hashCode���� ���ϱ� ������ �ʿ�
	@Override
	public int hashCode() {
		return Objects.hash(pNum);
	}
	
	// ������ �� ������ override
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		Person other = (Person) obj;
		return pNum.equals(other.pNum);
	}
}
