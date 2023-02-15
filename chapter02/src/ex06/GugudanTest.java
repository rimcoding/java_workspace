package ex06;

import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 단을 입력하세요");
		n1 = sc.nextInt();
		System.out.println("종료 단을 입력하세요");
		n2 = sc.nextInt();
	
		
		for(n3=n2; n1<=n3; n1++) {
			for(int i=1;  i<=9; i++) {
				System.out.println(n1+"*"+i+"=" +(n1*i));
			}
			System.out.println(" ");
		}		
	}
}
