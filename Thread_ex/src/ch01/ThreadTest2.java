package ch01;

public class ThreadTest2 {
	// 메인 쓰레드
	public static void main(String[] args) {
		// 흐름
		// Run main 쓰레드시작,main쓰레드종료
		// Runnable에서 쓰레드2개가 번갈아가면서 Not Runnable에 쉬었다가 작업함

		// 사용하는 방법 연습 !
		System.out.println("-----------main 쓰레드 시작------------");
		// 현재 쓰레드가 누구야 알아 보는 명령어 !!
		System.out.println(Thread.currentThread()); // main,5,main 여기서 5는 우선순위 현재 쓰레드가 누구인지 확인
													// 뭐부터 실행해라고 명령하는거는 개발자가 컨트롤 할 수 있는 영역이 아니다.
		// 작업자 하나 만들어 내기 (메인 쓰레드가 일 함)
		Woker woker1 = new Woker("워커1");
		// 너가 위임 받은 일을 시작해 --> start();
		woker1.start(); // 일해라 시켜놓고 먼저 출력값 --- main 쓰레드 종료 ----가 나온다.
						// 버튼을 눌러놓고 프로그램이 알아서 일을 하는거를 생각해보면 된다.

		// 쓰레드 (작업자) 하나 더 생성해보기
		// 동시에 작업자를 만들었기 때문에 woker1이 시작되고 바로 woker2가 실행되서 같이 작업한다.
		Woker woker2 = new Woker("워커2"); // 멀티 쓰레드

		woker2.start();

		System.out.println("-----------main 쓰레드 종료------------");
	} // end of main

} // end of class

// 쓰레드를 만들어 보기 (생성)
// -상속 활용해서 쓰레드 만들어보기 (작업자 만들어 보기)
// 쓰레드를 상속한 클래스이다. Woker는 Thread 이기도 하다 - 다형성
class Wokers extends Thread {

	private String name;

	public Wokers(String name) {
		this.name = name;
	}

	// 약속 부분 !
	// 나중에 start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그러면 쓰레드는 run 메소드 안에 있는 부분을 수행 시킨다. -- 약속 !!
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker  " + name + " : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // end of run!!
}