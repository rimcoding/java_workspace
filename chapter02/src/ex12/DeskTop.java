package ex12;

import ch12.Computer;

public class DeskTop extends Computer {
	@Override
	public void display() {
		System.out.println("모니터에 출력됩니다.");
	}
	@Override
	public void typing() {
		System.out.println("기계식 키보드로 타자를 칩니다");
	}

}
