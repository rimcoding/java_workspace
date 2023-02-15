package ex13;

import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		Random random = new Random();
		int Num = random.nextInt(12);
		String[] students = new String[12];
		students[0] ="편용림";
		students[1] ="김효린";
		students[2] = "배진석";
		students[3] = "손주이";
		students[4] = "김유주";
		students[5] = "김미정";
		students[6] = "김지현";
		students[7] = "박성희";
		students[8] = "이지운";
		students[9] = "정다운";
		students[10] = "이치승";
		students[11] = "이서영";
		System.out.println(students[Num]);
	//우리반 학생 이름들을 배열에 담아주세요.
	//랜덤 클래스를 사용해서
	//한명을 추출해보세요.
	}
}
