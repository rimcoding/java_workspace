package ex1;

public class MainTest1 {

	public static void main(String[] args) {
	Student student1 = new Student("James", 5000);
	Student student2 = new Student("Tomas", 10000);
	
	Bus bus100 = new Bus(100);
	Subway subway1 = new Subway(1);
	
	student1.takeBus(bus100);
	student2.takeSubway(subway1);
	
	student1.showInfo();
	student2.showInfo();
	
	bus100.showBusInfo();
	subway1.showSubwayInfo();
	}

}
