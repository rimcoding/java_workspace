package ch09;

public class BookmainTest2 {

	public static void main(String[] args) {
		
		//연관된 데이터를 통으로 관리 하고 싶다면 - 배열 (자료구조)
		//객체배열은 주소값이 할당된다.
		
		Book[] books = new Book[10];	//배열 선언 (메모리공간 만들어두기)
		books[0] = new Book("플러터UI실전","김근호");
		books[1] = new Book("무궁화꽃이피었습니다.","김진명");
		books[2] = new Book("흐르는강물처럼","파울로코엘료");
		books[3] = new Book("리딩으로리드하라","이지성");
		books[4] = new Book("사피엔스","유발하라리");
		books[9] = new Book("홍길동전","허균");
		//break문으로 했으면 도중에 멈춰 9가 출력이 안될 수 있다.

		System.out.println(books[0].getTitle());
		System.out.println(books[4].getAuthor());
		
		System.out.println("====================");
		
		//books.length : 배열의 길이(10)
		for (int i = 0; i < books.length; i++ ) {
			// i--> 0,1,2,3,4
			if(books[i] != null) {	//방어적 코드 작성
				System.out.println(books[i].getTitle());
			}else {
				break;
			}	
		}	
		
		// 주의 1 
		//인덱스의 크기는 n-1개다.
		// 배열의 길이와 인덱스의 길이는 다르다.
		
		//주의2
		//배열의 길이와 실제 들어가 있는 값의 갯수는 다를 수 있다.
		
		
		//문제
		//double 배열 3 선언 임의 값 넣고 출력해주세요.
		//3번째 인덱스는 값을 할당 하지 마시오.
				//출력은 for문 ->방어적 코드 작성
		double[] arr = new double[4]; //배열에 선언 (double 값) 
		arr[0] = 0.1;
		arr[1] = 0.2;
		arr[2] = 0.3;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] !=0.0) {
				System.out.println(arr[i]);
			}
		}
		//예제 books 를 사용하세요 !
		//문제 2
		//0번째 인덱스에 있는 녀석과 인덱스 2번째 녀석에 값을 스왑해주세요 !
		//임의의 공간을 만들어서 잠시 보관한다는 개념으로 접근해야 함
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
		
		//books[0] = // 답
		//books[2] = // 답
		
		//문제 3
		// 인덱스 3번에 값을 삭제 해주세요.
		books[3] = null;
		
		for (int i = 0; i < books.length; i++) {
			// i값 활용 !!!
			if(books[i] != null) {
				books[i].ShowInfo();
			}
			
		}
		
		
	}//end of main

}//end of class
