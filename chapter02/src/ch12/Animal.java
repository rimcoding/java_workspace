package ch12;

public abstract class Animal {
	
	// 추상 클래스란? (abstract class)
	//하나 이상의 주장 메서들을 포함하거나,abstract 키워들 가진 클래스
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	//추상 메서드 이다.
	//추상 메서드가 없어도 선언가능
	public abstract void hunt();
}
