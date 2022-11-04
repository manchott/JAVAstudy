package com.ssafy.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("¹Ú¼­¿µ");
		names.add("¹Ú¼­¿ë");
		names.add("¹Ú¼­¿µ");  // Áßº¹ Çã¿ë
		names.add(0, "¿µ¼­¿µ");
		
		System.out.println(names);
		
		// ºñ¾îÀÖ´ÂÁö ®G
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		
		for(int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		names.set(0, "´º¼­¿µ");
		
		System.out.println(names);
		
		names.remove("¹Ú¼­¿µ");
		
		System.out.println(names);
	}

}
