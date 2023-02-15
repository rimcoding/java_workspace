package ch04;

public class ForMainTest2 {
	public static void main(String[] args) {
		// 이중 for 문을 활용하여 2 ~ 9단까지 구구단을 출력해주세요
		for (int j = 2; j < 10; j++) {
			for (int i = 1; i < 10; i++) {
				// i 변수에 유효 범위는 end of 까지이다.
				System.out.println(j + " *  " + i + " = " + (j * i));
			} // end of for
		}
	} // end of main

} // end of class