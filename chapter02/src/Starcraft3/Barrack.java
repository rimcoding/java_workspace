package Starcraft3;

public class Barrack {

	private String name;
	
	public Barrack() {
		this.name = "배럭";
	}
	
	public Marine[] createMarines(int count) {
		Marine[]arr = new Marine[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Marine("마린"+(i+1));
			System.out.println("마린"+(i+1)+"을 생산합니다.");
		}
		return arr;
	}
}
