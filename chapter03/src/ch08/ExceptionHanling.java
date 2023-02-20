package ch08;

import java.util.Scanner;

public class ExceptionHanling {

	public static void main(String[] args) {

		// try-catch-finally
		// finally? 언제 사용할까?
		Scanner scanner = new Scanner(System.in);
		// scanner.close(); //더이상 데이터를 받지 않게 열어두지 않는다 (데이터 낭비를 줄이기 위해)

		try {
			int reuslt = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close(); // 자원 해제 용도로도 많이 사용된다.
		}

	} // end of main
} // end of class
