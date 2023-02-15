package ch01;

public class student {
	
	// 상태(속성) (멤버변수)
	int studentId;
	String studentName;
	String address;
	double height; //0.0
	boolean isMarried;
	
	// 기능
	
	// 공부한다.
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}
	
	//휴식한다.
	public void breakTime() {
		System.out.println(studentName +"학생이 휴식을 합니다.");
	}
	
	public void showInfo() {
		System.out.println("============상태창==============");
		System.out.println("학생에 ID값은 : " + studentId);
		System.out.println("학생에 이름은 : " + studentName);
		System.out.println("학생에 주소는 : " + address);
		System.out.println("===============================");
	}
	
	//함수와 메서드의 차이점
	//메서드란
	//자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	//멤버 함수(member function)
	//결론 : 메서드는 자신에 변수를 활용해서 객체의 기능을 구현하는 것 
	
	// 학생의 기능(메서드) 3가지 정의해주세요.
	
	public void working() {
		System.out.println(studentName+"학생이 운동을 합니다.");
	}
	public void chleaning() {
		System.out.println(studentName+"학생이 청소를 합니다.");
	}
	public void playing() {
		System.out.println(studentName+"학생이 열심히 놉니다.");
	}

	
	
	
	
}//end of class
