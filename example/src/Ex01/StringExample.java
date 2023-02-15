package Ex01;

public class StringExample {
	public static void main(String[] args) {
		
		//length()
		//문자열 데이터의 길이를 반환하는 메서드이다
		String str1 = "Hello Java";
		System.out.println(str1.length());	//10
		
		//concat()
		//문자열과 문자열을 결합하는 메서드이다.
		
		String str2 = "Hello";	
		String str3 = "java";
		System.out.println(str2.concat(str3));	//HelloJava
		
		//chatAt
		//인덱스에 위치한 문자를 반환하는 메서드이다.
		
		String str4 = "Hello Java";
		System.out.println(str4.charAt(4));	//o
		
		//isEmpty()
		//해당 문자열이 반 값인지 확인하는 메서드이다.
		
		String str5 = "Hello Java";
		System.out.println(str5.isEmpty());
		
		
	}
	
	
}
