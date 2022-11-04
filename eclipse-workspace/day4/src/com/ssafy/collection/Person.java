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
	
	// Set는 hashCode까지 비교하기 때문에 필요
	@Override
	public int hashCode() {
		return Objects.hash(pNum);
	}
	
	// 기존의 비교 문법을 override
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		Person other = (Person) obj;
		return pNum.equals(other.pNum);
	}
}
