package ch01;

//쓰레드를 상속한 클래스이다. 즉 Worke는 Thread 이기도 하다. - 다형성
class Woker extends Thread {
	
	private String name;
	
	public Woker(String name) {
		this.name = name;
	}
	
	//약속 부분 !
	//나중에 start 메서드를 통해서 쓰레드한테 일 시작해라고 명령을 줄 수 있다.
	// 그러면 쓰레드는 run 메소드 안에 있는 부분을 수행 시킨다. -- 약속 !!
	@Override
	public void run() {
		for(int i = 0; i<50; i++) {
			System.out.println("worker  " + name+" : " +i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} //end of run!!
}