package class04;

public class Student extends Person{
	String major;
	
	public Student() {
		super();
//		System.out.println("���� �л��� �⺻������");
	}
	
	public void study() {
		super.eat();
		System.out.println("�����Ѵ�");
	}
	
	public void eat() {
		System.out.println("������ �Դ´�");
	}
	
	@Override
	public String toString() {
		return name + major+"�Դϴ�";
	}
	
	

}
