package com.ssafy.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("�ڼ���");
		names.add("�ڼ���");
		names.add("�ڼ���");  // �ߺ� ���
		names.add(0, "������");
		
		System.out.println(names);
		
		// ����ִ��� �G
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		
		for(int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		names.set(0, "������");
		
		System.out.println(names);
		
		names.remove("�ڼ���");
		
		System.out.println(names);
	}

}
