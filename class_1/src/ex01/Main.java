package ex01;

public class Main {

	public static void main(String[] args) {
		Human human1 = new Human("아이유", "서울시 강남구 힐스테이스빌딩");
		Human human2 = new Human("장길산", "포항시 북구 창포동");
		
		TakeBox box1 = new TakeBox(1, "신발");
		TakeBox box2 = new TakeBox(2, "옷");
		TakeBox box3 = new TakeBox(3, "장난감");
	}

}
