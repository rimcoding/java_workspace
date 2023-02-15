package ch05;

public class MainTest1 {
	//메인함수
	public static void main(String[] args) {
		Student studentKim = new Student("홍길동",10_000);
//		studentKim.showInfo();
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2= new Subway(2);
		//객체와 객체간에 메세지 전달하기 (상호작용하기)
		
		studentKim.takeBus(bus100);
		System.out.println("-------------");
		//학생정보 확인
		studentKim.showInfo();
		//버스 정보 확인
		bus100.showInfo();
		//이해 포인트 = 객체간에 메세지 전달법
		
		//지하철 태워보기
		studentKim.takeSubway(subwayLine2);
		//학생정보
		studentKim.showInfo();
		
		//지하철 2호선 정보
		subwayLine2.showInfo();
		System.out.println("----------------");
		subwayLine1.showInfo();
		
		
		//괄호안에 타는 버스 번호를 넣어주고싶다?
		//bus200안에 담겨있는값은 주소값
		//heap 메모리에 저장되어서 쓸수있다.
		
		//run에서 포커스를 잡아서 쓰면 된다.
		//run 에서 run con에서 클릭해서 맞춰도 된다
		
		
	}//end of main

}//end of class
