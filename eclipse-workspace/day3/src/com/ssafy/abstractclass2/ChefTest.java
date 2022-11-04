package com.ssafy.abstractclass2;

public class ChefTest {
	public static void main(String[] args) {
		Chef c = new KFoodChef();
		c.cook();
		
		Chef c2 = new Chef() {
			@Override
			public void cook() {
				System.out.println("요리한다");
			}
		};
	}
}	
