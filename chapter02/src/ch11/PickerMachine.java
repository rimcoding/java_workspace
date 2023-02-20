package ch11;

import java.util.Random;
import java.util.Scanner;

public class PickerMachine {

	String name;
	int money;
	int runCount;

	public PickerMachine(String name) {
		this.name = name;
	}
	public void runGame() {
		this.money += 500;
		runCount++;
	}
	
	public void showInfo() {
		System.out.println("**뽑기결과**");
		System.out.println("뽑기 이름 : " + name);
		System.out.println("뽑기 횟수 : " + runCount);
		System.out.println("수익금 : " + money);
	}

	public static void main(String[] args) {
		// 실행 흐름
		// 기능 만들기
		// 랜덤 번호 1 ~ 3 중 하나 추출
		// 사용자 1 ~ 3 입력 받기
		// 맞으면 --> 상품 전달
		// 틀리면 --> 다시 시도, 돈을 넣어요 ~
		PickerMachine pickerMachine = new  PickerMachine("경품 추첨");
		Random random = new Random();
		Random toy = new Random();
		Toy[] toys = new Toy[3];
		toys[0] = new Toy("인형");
		toys[1] = new Toy("장난감");
		toys[2] = new Toy("자전거");
		int resultNumber = random.nextInt(3) + 1;
		int toyNumber = toy.nextInt(4);
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			pickerMachine.runGame();
			System.out.println("1~3 중 추첨권 번호를 입력 하세요");
			int userInput = sc.nextInt();
			if (userInput == resultNumber) {
				System.out.println("!!당첨!!");
				if(toyNumber == 0) {
					toys[0].showInfo();
				}else if(toyNumber == 1) {
					toys[1].showInfo();
				}else {
					toys[2].showInfo();
				}
				flag = false;
				pickerMachine.showInfo();
			} else {
				System.out.println("다음 기회에!");
				System.out.println("다시 시도?!");
				boolean answer = sc.nextBoolean();
				if(answer == true) {
					flag = true;
				}else {
					flag = false;
					 pickerMachine.showInfo();
				}
			}
		}

	}

}



