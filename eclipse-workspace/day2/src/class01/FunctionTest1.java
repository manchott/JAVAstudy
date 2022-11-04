package class01;

import java.util.Random;

public class FunctionTest1 {
	public static void main(String[] args) {
		boolean hw;
		System.out.println("아침에 일어난다.");
		move("교육장", "버스");
		hw = edu();
		move("집", "택시");
		if(hw)
			System.out.println("과제를 해결한다");
	}
	
	public static boolean edu() {
		System.out.println("공부한다.");
		Random random = new Random();
		
		return random.nextBoolean();
	}
	
	public static void move(String loc, String trans) {
		System.out.println(loc+"(으로)"+trans+"을 이용하여 이동");
	}
	
	
}
