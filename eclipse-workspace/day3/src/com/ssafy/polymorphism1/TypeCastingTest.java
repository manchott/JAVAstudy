package com.ssafy.polymorphism1;

public class TypeCastingTest {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // 문제 없음
		
		Person person = new Person();
		Object obj = person;
		// 자손 타입 객체를 조상 타입으로 참조할 때 문제 없음
		
		int i2 = 10;
		byte b2 = (byte)i2;  // 명시적인 타입 변환을 해야 함
		
		Person p = new Student();
		Student st = (Student)p;
		st.study();
		// 조상 타입을 자손으로 참조할 때 형변환 생략 불가능
		if(p instanceof Student) {
			Student st2 = (Student) p;
			st.study();
		}
		
		Person p2 = new Person();
		if(p2 instanceof Student) {
			Student st2 = (Student)p2;
			st2.study();
		}
	}

}
