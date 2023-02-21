package ch02;

public class Person {
	
	private String name;
	private int age;
	private Address address;
	
	public Person(String name, int age , Address address) {
		this.name = name;	//방어적코드
		this.age = age;
		this.address = address;
		// address = new Address("연수로 249번길","서울","자이303호","1234-456"); //1002
	}

	public Address getAddress() {
		return address;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
}
