package class02;

public class Car {
	String color;
	private int speed;
	
	public void setSpeed(int speed) {
//		this.speed = speed;
		if(speed <= 250 && speed >= 0)
			this.speed = speed;
		else
			System.out.println("�̻��� �ӵ��� ����������");
	}
	
	public int getSpeed() {
		return this.speed;
	}
	

}
