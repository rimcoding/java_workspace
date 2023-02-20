package ch04;


public class Water extends Material{
	@Override
	public String toString() {
		return "재료는 물 입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("물로 출력합니다.");
	}
}
