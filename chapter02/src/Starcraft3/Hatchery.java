package Starcraft3;

public class Hatchery {
	
	private String name;
	
	public Hatchery() {
		this.name = "해처리";
	}
	
	public Zergling[] createZerglings(int count) {
		Zergling[]arr = new Zergling[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Zergling("저글링"+(i+1));
			System.out.println("저글링"+(i+1)+"을 생산합니다.");
			if (i%3==0) {
				System.out.println("알이 부활에 실패하였습니다.");
			}
			if(i%10==0) {
				System.out.println("저글링 영웅이 탄생하였습니다.");
			}
		}
		return arr;
		//해처리는 업그레이드하여 중급유닛 고급유닛을 뽑을수있다.
		//이는 해처리와 배럭,게이트웨이
	}
}
