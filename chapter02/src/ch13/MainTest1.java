package ch13;

public class MainTest1 {

	public static void main(String[] args) {
		
		Aicar aicar = new Aicar();
		aicar.run();
		System.out.println("-------------");
		ManualCar manualCar = new ManualCar();
		manualCar.run();
	}
}
