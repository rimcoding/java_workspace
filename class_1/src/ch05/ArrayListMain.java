package ch05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		// List 계열
		List list0;
		// 순서가 있고 (인덱스) 중복이 가능하다.
		
		//자료구조 선언 - 정수를 담을 수 있는 메모리 공간 선언
		//배열의 크기를 안해줘도 된다.
		//뒤에 생략가능한거는 컴파일 과정에서 뒤에도 같은것이 들어온다고 예측이 가능하기 때문에
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> members = new ArrayList<>();
		ArrayList<String> strings = new ArrayList<>();
		
		//CRUD 개념을 잡고 이해하자.
		
		//값 추가 방법
		list.add(3); 	// 인덱스 0번이 할당
		list.add(null); 	// 인덱스 1번 값은 null
		list.add(100); 	// 인덱스 2번 값은 100
		list.add(1,20); // 인덱스 1번 값을 20으로 선언 (index번호 , 값 할당)
		//arrayList add(index, value) <-- 이 메서드는 끼워 넣기
		System.out.println(list.toString());
		// [3, 20, null, 100] (인덱스 1번 값이 들어고 다른값들은 밀린거를 볼 수 있다.
		System.out.println(list.size());
		//4
		//값 삭제 방법
		list.remove(2);
		System.out.println(list.toString());
		// [3, 20 ,100] 해당 하는 요소에 접근해서 제거하는것을 알 수 있다.
		System.out.println(list.size());
		//3
		
		//매번 삭제할려면
		//list.clear(); // <-- 전체 삭제
		System.out.println(list.toString());	//[]
		System.out.println(list.size());	//0
		
		//값을 화면에 출력하는 방법
		System.out.println("------------------------");
		// 배열은 인덱스 연산처리 , ArrayList, .get() 연산을 호출
		System.out.println(list.get(2)); //100
		System.out.println(list.get(0));	//3
		//System.out.println(list.get(20)); 	//없는데 접근하면 오류발생
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); //3 , 20 , 100
		}
		
		for (int abc상관없음 : list) {
			System.out.println("변수명아무꺼나 됨 : " + abc상관없음); 	//3,20,100
		}
		
		//값 검색 기능 사용해보기
		// 리스트 안에 값이 있는지 없는지 확인하기
		// 3, 20 ,100 <--- 70 값이 있는지 없는지 확인하는 코드 짜는법
		// 70은 int 데이터 타입 자동으로 형변환 // 클래스 타입으로 Integer
		System.out.println(list.contains(70)); 	//false
		System.out.println(list.contains(100)); 	//true
		
		// 100 값이 몇 번째 인덱스 요소에 있나?
		// indexOf
		System.out.println(list.indexOf(100));  //2
		//값이 있으면 해당하는 인덱스 번호를 리턴 한다.
		//만약 값이 없으면 무엇을 반환할까??
		System.out.println(list.indexOf(5000)); 	//-1
		//값이 없으면 반환한다.
		
		//추가
		Iterator<Integer> iter = list.iterator();  //반복자 녀석으로 현 변환해 줌 terator()
		while(iter.hasNext()) {
			System.out.println("값 확인 방법 : " + iter.next());
		}
		
	}

}

class Student{}
