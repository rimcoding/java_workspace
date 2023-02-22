package exex;

public interface Moveable {
	public abstract void left();
	public abstract void right();
	public abstract void up();
	// default 문법 사용해보기 !!
	// 후크 메서드 (구현부만 있고 로직은 없다)
	//Moveable 구현하는 클래스에서 필요하다면 재 정의해서 사용해!!
	//구현부가 있으니까 추상메서드가 아니여서 Bubble에서 지울수 있다.
	default public void down() {};
}