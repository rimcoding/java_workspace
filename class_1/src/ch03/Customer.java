package ch03;

public class Customer {

	private int Id;
	private String name;
	private String email;
	private String phone;
	//orders : List<Coffee>
	
	public Customer(String name ,  String email ,  String phone) {
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
}
