package com.ssafy.generic;

public class UseBoxTest {
	public static void main(String[] args) {
		// �ʵ�� Object�� ������ ������ �����̵��� ������ �� ����.
		NormalBox nbox = new NormalBox();
		nbox.setSome("Hello");
		
		Object some = nbox.getSome();
		if(some instanceof String) {
			String someStr = (String) some;
			System.out.println(someStr);
		}
		
		// ��ü�� ����
		GenericBox<String> gbox = new GenericBox<>();
		gbox.setSome("HI");
		String some2 = gbox.getSome();
		
		System.out.println(some);
	}

}
