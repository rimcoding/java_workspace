package ch05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class SetMainTest {

	public static void main(String[] args) {

		//제네릭을 쓰면 안정적인 프로그래밍이 가능하다
		// set계열은 순서가 없고 중복이 불가하다.
		Set<Integer> set1 = new HashSet<>(); 	//다형성
		//값을 추가하는 방법
		set1.add(1);
		set1.add(10);
		set1.add(100);
		set1.add(500);
		set1.add(1);
		set1.add(1);
		
		System.out.println(set1.toString()); //[1, 100, 500, 10]
		System.out.println(set1.size()); //4
		
		//삭제 하는 방법
		set1.remove(500);
		//없는 요소를 삭제 요청하더라도 오류 발생하지 않는다.
		set1.remove(1000);
		//set1.clear(); //요소 전체 삭제
		System.out.println(set1.toString()); //[]
		
		//Set 계열을 반복문 처리할 때 Iterator 타입으로 변환해서 처리 할 수 있다.
		Iterator<Integer> iter = set1.iterator(); //반복자로 형 변환 처리
		//hasNext(),next();
		// 오류가 나는 부분을 복사하고 catch()괄호 안에 넣어서 예외처리 한다.
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
//		try {
//			System.out.println("next 사용 1 : " + iter.next());
//			System.out.println("next 사용 2 : " + iter.next());
//			System.out.println("next 사용 3 : " + iter.next());
//		} catch (NoSuchElementException e) {
//			System.out.println("자료구조 안에 값이 없습니다.");
//		}
		
	}	//end of main

} //	end of class
