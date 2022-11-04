package class01;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Yang";
		p1.age = 45;
		p1.hobby = "Youtube";
		
		Person p2 = new Person();
		p2.name = "Hong";
		p2.age = 25;
		p2.hobby = "Golf";
		
		System.out.println(p1.name);
		System.out.println(Person.personCount);
	}

}
