package ch01;

public class MainTest1 {

	// 메인 함수 - 코드의 시작점
	public static void main(String[] args) {
	
		//The local variable studentKim may not have been initialized
		// 데이터 타입 - 사용자 정의 타입(대문자 --> 참조 타입)
		// 대문자로 쓰는건 다 참조타입
		// 오른쪽에서 왼쪽
		student studentKim = new student ();
		studentKim.studentId = 1;
		studentKim.studentName = "홍길동";
		studentKim.address = "부산시 해운대구";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		System.out.println("------------------------------");
		
		student studentLee = new student();
		studentLee.studentName = "이순신";
		studentLee.studentId = '2';
		studentLee.address = "부산시 진구";
		studentLee.study();
		
	}// end of main

}// end of class
