package ch08;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		//배열 선언과 동시에 초기화 하기
//		int[] arr  = new int[10];	
		int[] arr  = {1, 2, 3, 4, 5};	 	//배열의 길이 5 ,index - 4
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}                                                           //예외인지 검증단계를 거치지 않고 해서 예외가 뜸
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){ 			//Exception 최상위 예외 클래스 : 왠만한 예외는 확인이 된다.
			System.out.println("개발자야 인덱스 길이 모르니!!");
		}
		System.out.println("비정상 종료되지 않았습니다.");
		
		
	}	//end of main
}	//end of class
