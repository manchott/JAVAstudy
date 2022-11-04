package class02;

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "Red";
//		c.speed = 100;
		
		c.setSpeed(1000);
		System.out.println(c.getSpeed());
	}

}
