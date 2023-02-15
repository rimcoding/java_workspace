package Starcraft4;

import java.util.Scanner;

public class MainTest2 {

	//메인 함수
	public static void main(String[] args) {
		final int ZEALOT = 1;		//final 값이 변하지 않게 묶어뒀다.
		final int MARINE = 2;		
		final int ZERGLING = 3;
		final int GAME_END = 4;
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		Scanner sc = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택하세요");
			// \t : 탭간격만큼 띄우기, \n 한줄 떨어뜨리기
			System.out.println("1.질럿\t2.마린\t3.저글링\t4.종료");
			unitChoice = sc.nextInt();
			if (unitChoice == ZEALOT) {
				System.out.println("질럿을 선택하였습니다.");
			} else if (unitChoice == MARINE) {
				System.out.println("마린을 선택하였습니다.");
			} else if (unitChoice == ZERGLING) {
				System.out.println("저글링을 선택하였습니다.");
			} 
		} while (unitChoice != GAME_END);
		System.out.println("게임이 종료되었습니다.");

	}//end of main

}//end of class
