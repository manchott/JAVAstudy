package class01;

public class Person {
	static int personCount;
	String name;
	int age;
	String hobby;
	public Person() {
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
	
	public void eat() {
		System.out.println("음식을 먹는다");
	}
	
}
