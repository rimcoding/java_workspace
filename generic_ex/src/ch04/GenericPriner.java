package ch04;


// T는 Meterial 를 상속받은 녀석으로 제한
// 자바를 쓸때 유용한 클래스
//그중에 하나가 제네릭 프로그램
//똑같은 클래스 파일을 많이 안만들려고 씀
public class GenericPriner<T extends Material> {

	private T material;
	// double,int 들어오는걸 하나로 쓸수 있게 고안한것이 제네릭 프로그램
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}
