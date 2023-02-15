package ch01;

public class MainTest2 {

	public static void main(String[] args) {
		student studentLIm = new student ();
		studentLIm.studentId = 1;
		studentLIm.studentName = "홍길동";
		studentLIm.address = "부산시 해운대구";
		
		studentLIm.working();
		studentLIm.chleaning();
		studentLIm.showInfo();
	}

}
