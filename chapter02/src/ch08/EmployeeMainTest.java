package ch08;

public class EmployeeMainTest {

	public static void main(String[] args) {
	
		Employee employee1 = new Employee();
		employee1.setName("이순신");
		System.out.println(employee1.serialNum);
		
		Employee employee2 = new Employee();
		employee1.setName("홍길동");
		
		Employee employee3 = new Employee();
		employee1.setName("티모");
		
		// static 변수만 사용을 하면
		// 각 각에 객체가 가지는 상태값을 저장해야 한다면
		// 멤버 변수를 활용해서 사용해야 한다.
		System.out.println(Employee.serialNum);
		
		//홍길동 사원번호 확인 가능
		System.out.println(employee2.getEmploteeId());
		//티모에 사원번호 확인 가능
		System.out.println(employee3.getEmploteeId());
		
		
	}

}
