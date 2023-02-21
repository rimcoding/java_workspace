package ch06;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//학생 생성
		Student student1 = new Student(1,"Alice","alice@example.com" );
		Student student2 = new Student(1,"Bob","bob@example.com" );
		
		//과정 생성
		Course course1 = new Course(1, "수학", "introduction to Mathematics");
		Course course2 = new Course(1, "영어", "introduction to English");
				
		// 1번 학생이 Math 과정을 등록한다
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(1, student1, course2);
		
		// 학생의 데이터에 내가 등록한 정보를 저장시킬수 있다.
//		ArrayList<Enrollment> list = new ArrayList<>();
//		list.add(enrollment1);
//		student1.setEnrollments(enrollment1);
		// 통으로 List 를 저장하는 녀석
		student1.addEnrollment(enrollment1); // 0 번째 인덱스
		student1.addEnrollment(enrollment3);	// 1번째 자료구조 저장
		
		student2.addEnrollment(enrollment2); // 2번째 밥 등록신청 정보 저장
		
		//문제1
		// 밥이 신청한 과정에 이름을 화면에 출력하시오.
		//문제 해결 방안 - 요청 사항 : 학생으로 접근
		//ArrayList<Enrollments> a;
		//a.curse
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		//student2.getEnrollments().get(0).getCourse().getName(); 	//enrollment2
		
		//문제2
		//엘리스가 신청한 과정에 이름을 화면에 출력하시오.
		//문제 해결 방안 - 요청 사항 : 학생으로 접근
		//점을 연관해서 생각하자 (계속 안에 들어간다)
		System.out.println("-----------------------");
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(studentName + ",courseName : " + courseName);
		}
		//위 코드는 학생과 과목을 Enrollment 클래스를 통해서 연결하는 예제 코드이다.
	
		//문제3
		//Enrollment 1 학생 정보와 과목 정보를 반복문을 통해서 출력해주세요.
		//학생이름 : 이름
		// 수강 과목 : 과목이름
		// --------------------
		System.out.println("---------------------");
		System.out.println("학생이름 : " + enrollment1.getStudent().getName());
		System.out.println("수강과목 이름 : " + enrollment1.getCourse().getName());
		System.out.println("------------------");
		//문제 4
		//ArrayList 를 생성해서 Enrollment 저장해주세요.
		ArrayList<Enrollment> items = new ArrayList<>();
		items.add(enrollment1);
		items.add(enrollment2);
		items.add(enrollment3);
		for (Enrollment e : items) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("---------------");
			
		}
		// foreach Alice에 수강하고 있는 과목 이름을 다시 한번더 출력 하시오.
		for (Enrollment e : student1.getEnrollments()) {
			System.out.println(enrollment1.getCourse().getName());
		}
	} //end of main
	
	
	
}	//end of class
