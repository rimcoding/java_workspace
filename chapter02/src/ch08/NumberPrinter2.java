package ch08;

public class NumberPrinter2 {
	
	private  int id;
	
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
	//static 붙으면 더이상 메서드가 아닌 static함수라고 생각하자
	//static 안에서는 멤버변수를 활용할 수 없다.
	//객체가 메모리에 올라 갔다는 보장을 하지 못하기 때문이다.
	public static int getWaitNumber() {
		// id = 100;
		return waitNumber;
	}
	

}
