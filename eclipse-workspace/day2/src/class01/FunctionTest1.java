package class01;

import java.util.Random;

public class FunctionTest1 {
	public static void main(String[] args) {
		boolean hw;
		System.out.println("��ħ�� �Ͼ��.");
		move("������", "����");
		hw = edu();
		move("��", "�ý�");
		if(hw)
			System.out.println("������ �ذ��Ѵ�");
	}
	
	public static boolean edu() {
		System.out.println("�����Ѵ�.");
		Random random = new Random();
		
		return random.nextBoolean();
	}
	
	public static void move(String loc, String trans) {
		System.out.println(loc+"(����)"+trans+"�� �̿��Ͽ� �̵�");
	}
	
	
}
