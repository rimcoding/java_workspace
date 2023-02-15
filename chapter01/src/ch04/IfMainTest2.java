package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	// main 함수 
	public static void main(String[] args) {
		
		System.out.println("성적을 입력 하세요");
		
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt(); 
		// 100 ~ 90  A 학점 입니다. 
		// 89 이하 80이상이거나 같다면 B 학점 입니다. 
		// 79 이하 70이상이거나 같다면 C 학점 입니다. 
		// 69 이하 60이상이거나 같다면 D 학점 입니다. 
		// 나머지 F 학점 입니다. 
		char reuslt = 'Z';
		
		if (point >= 90 && point <= 100) {
			reuslt  = 'A';
		} else if(point >= 80 && point <= 89) {
			reuslt  = 'B';
		} else if(point >= 70 && point <= 79) {
			reuslt  = 'C';
		} else if(point >= 60 && point <= 69) {
			reuslt  = 'D';
		} 
		
		// 방어적 코드를 작성 
		if(reuslt == 'Z') {
			System.out.println("값을 잘못 입력 하였습니다.");
		} else {
			System.out.println( reuslt +  " 학점입니다.");
		}
		//점수에 따라 학점이 나온다.
		
	} // end of main 
 
} // end of class