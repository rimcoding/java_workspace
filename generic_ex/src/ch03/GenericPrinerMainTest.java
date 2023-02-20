package ch03;

import ch02.Plastic;
import ch02.Power;

public class GenericPrinerMainTest {

	public static void main(String[] args) {

		Podwer podwer = new Podwer();
		Plastic plastic = new Plastic();
		
		//사용 방법
		//	GenericPriner<Power> genericPriner = new GenericPriner<Power>();
		GenericPriner<Podwer> genericPriner = new GenericPriner<>();
		//Power 로 지정해줬기 때문에 Power만 된다.
		//뒤에 뭐 들어올지 컴파일러가 예측을 해준다.
		//이때 컴퓨터가 이해할수있는 언어로 바뀐다.(실행했을때) 
		
		// 재료 넣기
		// 최상위 클래스인 Object를 활용하는 것보다 보다 안정적인 코드를 만들 수 있다.
		//또한 가독성도 높아 진다.
		//genericPriner.setMaterial(plastic); 	//plastic을 넣으면 컴파일 시점에 오류
		genericPriner.setMaterial(podwer); 	
		
		//재료 꺼내기
		//다운 캐스팅을 할 필요가 없다.
		Podwer usePower = genericPriner.getMaterial();
		//Plastic usePower = genericPriner.getMaterial();
		//잘못된 데이터 타입으로 대입하면 컴파일 시점에 오류를 잡아준다.
		
		//결론 : 보다 가독성 높고 안정적인 프로그래밍을 만들 수 있다.
		//같은 변수이름 같은 기능이라면 제네릭 프로그래밍을 설계하면 된다.
		
		//자료구조
		//자료구조를 배워야 하는 이유
		//예로들면 청소를 할때 물건들을 마구잡이로 넣어두면 찾는데 시간이 오래 걸린다.
		//물건들을 빨리 찾게 선반에 정리하는것을 말한다.
		
		
	}	//end of main

}
