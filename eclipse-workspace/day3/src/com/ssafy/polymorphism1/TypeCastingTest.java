package com.ssafy.polymorphism1;

public class TypeCastingTest {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; // ���� ����
		
		Person person = new Person();
		Object obj = person;
		// �ڼ� Ÿ�� ��ü�� ���� Ÿ������ ������ �� ���� ����
		
		int i2 = 10;
		byte b2 = (byte)i2;  // ������� Ÿ�� ��ȯ�� �ؾ� ��
		
		Person p = new Student();
		Student st = (Student)p;
		st.study();
		// ���� Ÿ���� �ڼ����� ������ �� ����ȯ ���� �Ұ���
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
