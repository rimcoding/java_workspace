package Starcraft3;

public class BarrackMainTest {

	public static void main(String[] args) {
		
		Barrack barrack = new Barrack();
		Marine[] marine = barrack.createMarines(5);
		for (int i = 0; i < marine.length; i++) {
			System.out.println(marine[i]);
		}
//		System.out.println(marine[0]);
//		System.out.println(marine[1]);
//		System.out.println(marine[2]);
//		System.out.println(marine[3]);
//		System.out.println(marine[4]);
	}
}
