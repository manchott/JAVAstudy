package class03;

public class StudentManager {
	private Student[] students = new Student[100];
	private int size = 0;
	
	private static StudentManager manager = new StudentManager();
	
	private StudentManager() {
		
	}
	
	public static StudentManager getManager() {
		return manager;
	}
	
	
	
	
	public void addStudent(Student s) {
		students[size++] = s;
	}
	
	void changeMajor(String name, String major) {
		Student s = getStudent(name);
		if(s != null) {
			s.setMajor(major);
		}
	}
	
		
	Student getStudent(String name) {
		for(int i = 0; i<size; i++) {
			if(name.equals(students[i].getName())) {
				return students[i];
			}
		}
		return null;
			
	}

}
