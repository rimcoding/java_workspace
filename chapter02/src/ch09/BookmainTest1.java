package ch09;

public class BookMainTest1 {

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

		} //end of main
}	//end of class
