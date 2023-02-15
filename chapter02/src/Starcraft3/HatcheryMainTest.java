package Starcraft3;

public class HatcheryMainTest {

	public static void main(String[] args) {
	Hatchery hatchery = new Hatchery();
	Zergling[] zerglings = hatchery.createZerglings(20);
	for (int i = 0; i < zerglings.length; i++) {
		System.out.println(zerglings[i]);
	}

//	System.out.println(zerglings[0]);
//	System.out.println(zerglings[1]);
//	System.out.println(zerglings[2]);
//	System.out.println(zerglings[3]);
//	System.out.println(zerglings[4]);
//	System.out.println(zerglings[5]);
//	System.out.println(zerglings[6]);
//	System.out.println(zerglings[7]);
//	System.out.println(zerglings[8]);
//	System.out.println(zerglings[9]);
//	System.out.println(zerglings[10]);
}
}
