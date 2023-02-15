package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {
		
		//
		Human human = new Human();
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		human.name = scanner.nextLine();
		System.out.println("키를 입력하세요.");
		human.height = scanner.nextInt();		
		System.out.println("몸무게를 입력하세요.");
		human.weight = scanner.nextInt();
		System.out.println("당신은 남자입니까?");
		human.isMan = scanner.nextBoolean();
		System.out.println("0을 입력시 상태창을 출력");
		if (scanner.nextInt()==0) {
		human.showInfo();
		}
		
		// 스캐너를 활용해서 값을 할당해주세요.
		//마지막에는 showInfo 메서드 호출해서 값을 확인해주세요.
		//심화 0번 입력시에 showInfo 호출
		//스캐너를 통해서 showInfo 메서드 호출 기능 만들어 보기
		
	}	//end of main

}	//end of class
