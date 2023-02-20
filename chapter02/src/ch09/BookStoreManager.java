package ch09;

import java.util.Scanner;

public class BookStoreManager {

	public static void main(String[] args) {
		// 책을 저장하는 기능을 만들고 정보를 출력하는 프로그램을 만들어주세요.
		// while문 사용 1.저장 2.전체조회 3.선택조회 4.전체삭제 5.프로그램 종료
		
		int count = 0;
		Book[]books = new Book[100];
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		String userInput = null;
		
		
		while(flag == true) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.저장    2.전체조회   3.선택조회   4.전체삭제   0 종료");
			userInput = sc.nextLine();
			if(userInput.equals("0")) {
				flag = false;
				System.out.println("시스템 종료");
			}else if(userInput.equals("1")) {
				System.out.println("책번호를 입력하세요");
				String number = sc.nextLine();
				System.out.println("제목을 입력하세요");
				String title = sc.nextLine();
				System.out.println("저자를 입력하세요");
				String author = sc.nextLine();
				books[count] = new Book(number, title);
				System.out.println(number+"번째이며 "+"제목은 "+title+" 으로 저장되었습니다");
				count++;
			}else if(userInput.equals("2")) {
				System.out.println("모든책을 조회합니다.");
				for(int i = 0; i < books.length; i++) {
					if(books[i] != null) {
						books[i].ShowInfo();
					}
				}
			}else if(userInput.equals("3")) {
				System.out.println("조회할 책번호를 입력하세요.");
				String Booknumber = sc.nextLine();
				for(int i=0; i < books.length; i++) {
					if (books[i] != null) {
						if (books[i].getTitle().equals(Booknumber)) {
							books[i].ShowInfo();
						}
					}
				}
			}else if(userInput.equals("4")) {
				System.out.println("전체삭제 되었습니다.");
				for (int i = 0; i < books.length; i++) {
					if (userInput.equals("4")) {
						books[i] = null;
					}
				}
			}
		}	


	}// end of main

}// end of class
