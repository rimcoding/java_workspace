package ch08;

public class NumberPrinter2 {
	
	private int id;
	//private int waitNumber;
	//private static int waitNumber;
	public static int waitNumber;
	// 생성자는 맨 먼저 실행되고 한번만 수행이 된다.
	public NumberPrinter2(int id) {
		this.id = id;
		//this.waitNumber = 1;
	}
	
	//번호표를 출력합니다
	public void printwaitNumber() {
			System.out.println(" 대기순번 " + waitNumber);
			waitNumber++;
	}
	public static int getWaitNumber() {
		return waitNumber;
	}
	

}
