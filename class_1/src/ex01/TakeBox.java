package ex01;

public class TakeBox {

	private int Number;
	private String take;
	
	public TakeBox(int number, String take) {
		super();
		Number = number;
		this.take = take;
	}

	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getTake() {
		return take;
	}

	public void setTake(String take) {
		this.take = take;
	}

	
	
}