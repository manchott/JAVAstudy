package com.ssafy.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("박서영");
		names.add("박서용");
		names.add("박서영");  // 중복 허용
		names.add(0, "영서영");
		
		System.out.println(names);
		
		// 비어있는지 췍
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		
		for(int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		names.set(0, "뉴서영");
		
		System.out.println(names);
		
		names.remove("박서영");
		
		System.out.println(names);
	}

}
