package ex02;

import ex01.GenericPriner;

public class BoxMainTest {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.put("안녕 반가워");
		System.out.println(box1.isEmpty());
		System.out.println("-------------------");
		
		String msg = box1.take();
		System.out.println("msg : " + msg);
		System.out.println(box1.isEmpty());
	
	}

}
