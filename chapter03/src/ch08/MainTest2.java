package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		
		//예외 처리 구문 작성
		// 10 / 0 연산 시키고 예외 처리 까지 작성해주세요.
		//1. try
		//2.클래스 설계 throw 활용
		//NumberInputManger numberManager = new NumberInputManger(10);
		
		int number1= 10;	
		int number2 = 0;
		try {
			int number3 = number1/number2;
		} catch (Exception e) {
			System.out.println("10에서 0을 나누면 끝도 없습니다.");
		}
		
		Calculator calculator = new Calculator();
		
		try {
			calculator.divide(10, 0);
		} catch (Exception e) {
			System.out.println("10에서 0을 나누면 끝도 없습니다.");
		}
		
	}	//end of main

}	//end of class
// throw 클래스 설계

class Calculator{
	
	int result;
	
	public int divide(int n1,int n2) throws Exception{
		
		return result = n1/n2;
		
	}
	
}

