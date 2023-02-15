package ch12;

public class MainTest1 {
		
	public static void main(String[] args) {
		//기본적으로 추상 클래스는 new 할수 없다.
		// abstract --> 개발자 한테 직접 new 를 막아 버림
		//화면에 안나오게 할때 추상 클래스를 쓴다 
		//게임에서 Hero가 화면에 안나오는 개념
		
		Animal animalHuman = new Human(); 
		animalHuman.hunt();
		System.out.println("----------------");
		Animal animalPerson = new Human();
		animalPerson.hunt();
	}
}
