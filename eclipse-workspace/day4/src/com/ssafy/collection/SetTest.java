package com.ssafy.collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Kim");
		set.add("Hong");
		set.add("Lim");
		set.add("Kim");
		set.add("Apple");  // ���ĺ� ������ �� �� ������ ����� ����
		System.out.println(set);  // �ߺ��� ������� �ʱ� ������ Kim�� �Ѱ�
		
//		Set<Person> pSet = new HashSet<>();
//		Person p1 = new Person("��", "654");
//		Person p2 = new Person("qkr", "654");
//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("����", "123"));
		pSet.add(new Person("����", "123"));
		System.out.println(pSet);
		
	}

}
