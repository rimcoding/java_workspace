package ch03;

public class Coffee {
	private int Id;
	private String name;
	private double price;
	
	public Coffee( int Id,String name,double price) {
		this.Id = Id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
