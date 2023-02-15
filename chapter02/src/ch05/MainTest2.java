package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생성
		Student studenAhh = new Student("아이유", 150_000);
		
		Bus bus102 = new Bus(102);
		Bus bus501 = new Bus(501);
		Bus bus701 = new Bus(701);
		
		
		Scanner sc = new Scanner(System.in);
	
		
		//102번과 501번중에 탈것을 정하시오
		int result;
	
			System.out.println("무슨 버스를 타실건가요?");
			result = sc.nextInt();	
		if(result == 102) {
			studenAhh.takeBus(bus102);
			studenAhh.showInfo();
			bus102.showInfo();
		}
		else if(result == 501) {
			studenAhh.takeBus(bus501);
			studenAhh.showInfo();
			bus501.showInfo();
		}else if(result == 701) {
			studenAhh.takeBus(bus701);
			studenAhh.showInfo();
			bus501.showInfo();
			}
		
		
		//1단계 - 사용해 보기
		//2단계 - 스캐너를 활용해서 직접 실행에 흐름을 다시 만들어 보세요.
		// 몇명 몇명 누구 
		//Scanner scanner
	}

}
