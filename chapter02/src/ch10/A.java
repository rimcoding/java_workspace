package ch10;

public class A {
	String name;
	int height;
	int weight;
	int age;
	
		// 코드 테스트
		public static void main(String[]args) {
			
			C myC = new C();
		   myC.age = 100;
		   System.out.println(myC.age);
			
		}
}//end of A class
//기능을 추가하기 위해서

class B{
	String name;
	int height;
	int weight;
	int age;
	
	int level;
	String nicName;
	
}//end of B class
//A와C는 상속관계 
class C extends A{
	
	String phone;
}//end of C class