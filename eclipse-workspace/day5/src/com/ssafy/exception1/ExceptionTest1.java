package com.ssafy.exception1;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int[] nums = { 10 };
		
		//Unchecked Exception
		try {
			System.out.println(nums[2]);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ũ�Ⱑ �Ѿ���ϴ�");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("���α׷��� �����մϴ�");
	}

}