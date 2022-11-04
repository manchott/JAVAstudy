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
		set.add("Apple");  // 알파벳 순서로 들어갈 것 같지만 사실은 랜덤
		System.out.println(set);  // 중복을 허용하지 않기 때문에 Kim은 한개
		
//		Set<Person> pSet = new HashSet<>();
//		Person p1 = new Person("김", "654");
//		Person p2 = new Person("qkr", "654");
//		System.out.println(p1 == p2);
//		System.out.println(p1.equals(p2));
		
		Set<Person> pSet = new HashSet<>();
		pSet.add(new Person("서영", "123"));
		pSet.add(new Person("서윤", "123"));
		System.out.println(pSet);
		
	}

}
