package com.ssafy.interface1;

public interface MyInterface {
	public static final int MEMBER1 = 10;
	int MEMBER2 = 10;  // public static final 생략가능
	
	public abstract void method1(int param);
	void method2(int param);  // public abstract 생략가능

}
