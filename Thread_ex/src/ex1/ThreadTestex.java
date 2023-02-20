package ex1;

public class ThreadTestex {
	
	public static void main(String[] args) {
		
		System.out.println("---------main 쓰레드 시작----------");
		System.out.println(Thread.currentThread()); 	//현재 쓰레드가 누군지 알아보는것
		
		Animal animal1 = new Animal("1번말");
		
		animal1.start();
		
		Animal animal2 = new Animal("2번말");
		
		animal2.start();
		
		Animal animal3 = new Animal("3번말");
		
		animal3.start();
	}

}
//쓰레드 만들어보기

class Animal extends Thread{
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <i; j++) {
				if (j==3) {
					System.out.println(name+ "이 속도를 내지 못합니다.");
				}else if (j==5) {
					System.out.println(name+"이 속도를 냅니다.");
									}
			}
			System.out.println(name+"이 달립니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
} //end of run

class Animal2 extends Thread{
	
}
