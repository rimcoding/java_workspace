package ch08;

public class ArrayMainTest {

	public static void main(String[] args) {
		//배열이란
		//!!! 연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입이다.
		// 변수가 하나의 데이터를 저장하기 위한 것이라면
		// 배열은 여러개의 데이터를 하나의 변수에 저장하기 위한 것이다.
		
		
		//배열을 선언할 때 몇 칸에 공간을 사용할지 먼저 지정해 주어야 한다 !!! 
		int [] arr = new int[5];
		
		//String 담을 배열 선언
		String [] ahh = new String[5];
		ahh[0] = "국어";
		ahh[1] = "수학";
		ahh[2] = "영어";
		ahh[3] = "중국어";
		ahh[4] = "일본어";
		System.out.println(ahh[0]);
		//double 담을 배열 선언
		double [] agg = new double[5];
				agg[0] =  20.5;
				agg[1] =  30.4;
				agg[2] = 10.8;
				agg[3] = 9.7;
				agg[4] = 11.4;
		System.out.println(0);
		//네모칸안에 값을 넣는 방법 (인덱스 연산 값 할당)
		arr[0] = 1;
		arr[1] = 100;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 300;
		
		//값을 확인하는 방법
		System.out.println(arr[2]);
	}

}
