package ch03;

public class CoffeShop {

	private int Id;
	private String name;
	private String Location;
	
	public CoffeShop(int Id,String name, String Location) {
		this.Id = Id;
		this.name = name;
		this.Location = Location;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return Location;
	}
}
