package ex2;

public class MainTest {

	public static void main(String[] args) {
		
		Reray reray = new Reray();
		
		Runningman1 runningman1 = new Runningman1(reray);
		Runningman2 runningman2 = new Runningman2(reray);
		Runningman3 runningman3 = new Runningman3(reray);
		Runningman4 runningman4 = new Runningman4(reray);
		
		runningman1.start();
		runningman2.start();
		runningman3.start();
		runningman4.start();
		
	}
}
