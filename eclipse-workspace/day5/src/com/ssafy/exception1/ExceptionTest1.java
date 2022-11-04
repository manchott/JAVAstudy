package com.ssafy.exception1;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int[] nums = { 10 };
		
		//Unchecked Exception
		try {
			System.out.println(nums[2]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기가 넘어갔습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램을 종료합니다");
	}

}
