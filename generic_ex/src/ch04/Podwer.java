package ch04;


public class Podwer extends Material {
	
	@Override
	public String toString() {
		//toString object 최상위 클래스에 있는놈
		return "재료는 파우더 입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더로 출력합니다.");
	}
}
