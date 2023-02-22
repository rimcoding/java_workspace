package ch05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		//while 0 종료 1.저장 2전체조회 3 선택조회 4 선택삭제 5 전체삭제
		//tip -> 데이터 입력
		//샘플 데이터 만들어서 활용
		Scanner scanner = new Scanner(System.in);
	
		Map map;
		
		Map<String, String> phonebook1 = new HashMap<>();
		boolean flag = true;
		
		phonebook1.put("홍길동", "010-4321-1452");
		phonebook1.put("장길산", "010-2321-5452");
		phonebook1.put("이몽룡", "010-2321-9452");
		phonebook1.put("성춘향", "010-5321-5432");
		
		
		
		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_THTLE = "3";
		final String SELETE_BY_THTLE = "4";
		final String DELETE = "5";
		final String End = "0";
		
	
		while(flag) {
			System.out.println(">>기능을 선택해주세요<<");
			System.out.println("0 종료 1.저장 2전체조회 3 선택조회 4 선택삭제 5 전체삭제");
			String userInput = scanner.nextLine();
			if (userInput.equals(SAVE)) {
				System.out.println("이름을 입력하시오");
				String name = scanner.nextLine();
				System.out.println("전화번호를 입력하시오");
				String number = scanner.nextLine();
				phonebook1.put(name, number);
				System.out.println(name+"님의 전화번호가 저장되었습니다.");
			}else if (userInput.equals(SEARCH_ALL)) {
				for(String key : phonebook1.keySet()) {
					System.out.println(key+" "+phonebook1.get(key));
				}
			}else if (userInput.equals(SEARCH_BY_THTLE)) {
				System.out.println("이름을 입력하시오");
				String name = scanner.nextLine();
				phonebook1.get(name);
				System.out.println(name+"의 전화번호는 "+phonebook1.get(name));
			}else if (userInput.equals(SELETE_BY_THTLE)) {
				System.out.println("삭제할 이름을 입력해주세요");
				String name = scanner.nextLine();
				phonebook1.remove(name);
				System.out.println(name+"님의 전화번호가 삭제되었습니다.");
			}else if (userInput.equals(DELETE)) {
				phonebook1.clear();
				System.out.println("전화번호가 전체 삭제 되었습니다.");
			}else if(userInput.equals(End)){
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("잘못된 입력값입니다.");
			}
		}
			
	
			
			
		
	} 	//end of main

}	//end of class
