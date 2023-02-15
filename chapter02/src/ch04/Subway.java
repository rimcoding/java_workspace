package ch04;

public class Subway {
		//상태
		int lineNumber;
		int passernegerCount;
		int money;
		
		//기능
		public void take(int count) {
			this.passernegerCount +=count;
			this.money += (1_200 * count);
		}
		
		public void takeOff(int count){
			this.passernegerCount -=count;
		}
		
		public void showInfo() {
			System.out.println("상태 창");
			System.out.println("지하철 호선 번호 : " +this.lineNumber);
			System.out.println("승객 수 : " +this.passernegerCount);
			System.out.println("수익 금 : " +this.money);
		}
		
}
