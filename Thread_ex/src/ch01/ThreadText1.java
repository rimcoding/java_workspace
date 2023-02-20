package ch01;

public class ThreadText1 {

	// 메인 쓰레드
	public static void main(String[] args) {
		// 작업에 단위 쓰레드 동작
		for (int i = 0; i < 30; i++) {
			// System.out.println("i : " + i + "\t");

			System.out.print("-");
			try {
				// 너무 빠르니까 0.5초동안씩 잠들어라고 쓰레드 한테 명령
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class
