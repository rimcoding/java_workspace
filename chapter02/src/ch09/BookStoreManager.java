package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {

		//TIp
		//숫자 받는거 -->문자열
		
		// while 문을 사용해서
		//CRUD 에 개념
		//1.저장. 2.전체조회 3.선택조회 4.전체삭제 0. 프로그램 종료
		// 도구 준비
		Scanner sc = new Scanner(System.in);
		// 먼저 몇칸 사용할지 정해 주어야 한다.
		Book[]books = new Book[100];
		String userInput = null;
		boolean flag = true;
		
		while(flag == true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.저장    2.전체조회   3.선택조회   4.전체삭제   0 종료");
			userInput = sc.nextLine();
			if(userInput.equals("0")) {
				// 프로그램 종료
				flag = false;
				System.out.println("시스템 종료");
			}
			if(userInput.equals("1")) {
				System.out.println("책번호를 입력하세요");
				String number = sc.nextLine();
				System.out.println("제목을 입력하세요");
				String title = sc.nextLine();
				System.out.println("저자를 입력하세요");
				String author = sc.nextLine();
				System.out.println(sc.nextLine());
			}
			if(userInput.equals("2")) {
				for(int i = 0; i < books.length; i++) {
					if(books[i] != null) {
						System.out.println();
					}
				}
			}
			if(userInput.equals("3")) {
				System.out.println("조회할 책번호를 입력하세요.");
				String nuber = sc.nextLine();
			}
			if(userInput.equals("4")) {
				
			}
		}
		System.out.println("종료");
		
		
		// 책을 저장하는 기능 만들고
		// 정보를 출력하는 프로그래밍 만들어 주세요
		// 스캐너
		//
		// 문자열
		// 값을 비교 하는 연산자 ==
		
		
		
		
		
		
		
		
		
		
		
		
//		String temp = "안녕";
//		if (temp.equals("반가워")) {
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요~~");
//		}
//		System.out.println("------------------");
//		if ("반가워".equals(temp)) {
//			System.out.println("같은 값 확인");
//		} else {
//			System.out.println("값이 달라요~~");
//		}
		
		
		
		
	
		
		

	}// end of main

}// end of class
