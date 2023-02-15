package ch01;

// 수입 하다. 가져 오다.
import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(scanner);
		student studentkim = new student();
		//주소값이 출력이된다
		System.out.println(studentkim);	//주소값이 출력이 된다.
		//주언어를  모아두는 파일을 패키지라고 한다.
		student studentLee = new student();	//주소값이 출력이 된다.
		System.out.println(studentLee);
		// 기본 데이터 타입 -- 값(리터럴)이 출력이 된다.
		// 참도 타입 - 주소값이 출력이 된다.
		System.out.println("-------------------------");
		System.out.println(studentLee.studentId);
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.address);
		System.out.println(studentLee.height);
		System.out.println(studentLee.isMarried);
		// 멤버 변수는 메모리에 올라 간 뒤 멤버 변수에 값을 할당 하지 않으면
		//기본값으로 먼저 초기화 해 준다. (컴파일러가 알아서 초기화 해줌)
		
		
	}

}
