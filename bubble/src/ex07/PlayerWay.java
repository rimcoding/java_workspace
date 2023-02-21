package ex07;

// enum 타입을 사용하는 이유 (가독성)
//PlayerWay.LEFT , PlayerWay.RIGHT 이런식으로 사용할 수 있다.
// 데이터에 범주화(도메인)이 필요하다면 enum 타입을 사용할 수 있다.
//		ex) 나는 범위를 위,아래,왼쪽,오른쪽에서 왼쪽,오른쪽만 쓰겠어.
//		ex) 나는 과일중에 종류가 너무 많으니까 딸기,바나나만 쓰겠어.
public enum PlayerWay {
	
	LEFT,RIGHT
}
