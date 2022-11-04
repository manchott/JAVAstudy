package class04;

public class Student extends Person{
	String major;
	
	public Student() {
		super();
//		System.out.println("나는 학생의 기본생성자");
	}
	
	public void study() {
		super.eat();
		System.out.println("공부한다");
	}
	
	public void eat() {
		System.out.println("지식을 먹는다");
	}
	
	@Override
	public String toString() {
		return name + major+"입니다";
	}
	
	

}
