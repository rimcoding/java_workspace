package ch04;

public class MainTest {

	public static void main(String[] args) {

		GenericPriner<Podwer> genericPriner1 = new GenericPriner<>();
		GenericPriner<Plastic> genericPriner2 = new GenericPriner<>();

		// 재료넣기
		genericPriner1.setMaterial(new Podwer());
		genericPriner2.setMaterial(new Plastic());

	}

}
