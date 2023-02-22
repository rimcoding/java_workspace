package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainTest3 {

	public static void main(String[] args) {
		//Map 자료구조를 이용해서 전화번호를 저장 해주세요.
		// 1 - String, String
		// 저장하고 꺼내고 삭제
		//2 - String, Object(Person) 
		Map map;
		
		Map<String, String>phonenumber = new HashMap<>();
		
		phonenumber.put("홍길동", "010-1234-5678");
		phonenumber.put("홍길동", "010-1234-5678");
		phonenumber.put("홍길도", "010-1235-3678");
		phonenumber.put("홍길철", "010-3234-5678");
		phonenumber.put("홍길마", "010-1234-5679");

		//key 값은 중복 될수가 없다.
		System.out.println(phonenumber);
		
		System.out.println(phonenumber.get("홍길동"));
		
		System.out.println("size : " +phonenumber.size());

		for(Entry<String,String> entry1 : phonenumber.entrySet()) {
			System.out.println(entry1.getKey()+"\n"+entry1.getValue());
		}
	
	} //end of main

}	//end of class
