package ch02;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();
		ToyCar toyCar = new ToyCar();
		
		//다형성
		RemoteController controller1 = televison;
		RemoteController controller2 = refrigerator;
		RemoteController controller3 = robot;
		RemoteController controller4= toyCar;
		
		//다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = televison;
		remoteControllers[1] = refrigerator;
		remoteControllers[2] = robot;
		remoteControllers[3] = toyCar;
		
		// 문제 - 1:
		//for문을 활용해서 전원을 전부 켜주세요
		for(int i=0; i<remoteControllers.length; i++) {
			remoteControllers[i].turnOn();//컴파일 시점, (turnOn, turnOff)
		}
		//문제 - 2;
		//index 값이 3 번째 녀석이면 자신에 타입을 화면에 출력해 주세요.
		for(int i=0; i<remoteControllers.length; i++) {
			if(i==3) {
				System.out.println("3번째 녀석은 ToyCar 데이터 타입 입니다.");
			}
		}
		//문제 - 3;
		//만약 데이터 toyRobot 이면 멤버 변수 name 값을 출력해 주세요.
		for(int i=0; i<remoteControllers.length; i++) {
			if(remoteControllers[i] instanceof ToyRobot) {
				// 업캐스팅 된 상태 이기 때문에
				// 자식 타입으로 바라보기 위해서는 다운 캐스팅 개념을 알고 잇어야 한다.
				System.out.println(((ToyRobot)remoteControllers[i]).name);
			}
		}
		
		//문제 - 4;
		//장난감 로봇에 소리 기능을 추가해 달라는 요청
		//냉장고에도 소리나는 기능을 추가해 달라고 요청
		//소리기능 --> 인터페이스로 설계
	
	}	//end of main

}	//end of class
