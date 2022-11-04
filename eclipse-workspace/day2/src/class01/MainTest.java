package class01;

public class MainTest {
	public static void main(String[] args) {
//		Person p = new Person();
		Student st = new Student();
		
		st.eat();
		st.name = "Yang";
		st.major = "computer";
		st.age = 45;
		
		System.out.println(st.toString());
	}
}
