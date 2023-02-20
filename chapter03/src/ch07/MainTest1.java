package ch07;

public class MainTest1 {

	public static void main(String[] args) {
   
		Student student1 = new Student(1, "아이유");
		Student student2 = new Student(2, "아이유");
		Student student3 = new Student(3, "이효리");
		
		System.out.println(student1);
		System.out.println(student2);
		
		student1.equals(student2);
		Boolean result = student1.equals(student2);
		System.out.println(result);
	}

}
