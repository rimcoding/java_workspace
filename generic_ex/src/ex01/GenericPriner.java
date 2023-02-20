package ex01;

public class GenericPriner<T extends Material> {

	private T matarial;
	
	public T getMaterial() {
		return matarial;
	}
	
	public void setMaterial(T material) {
		this.matarial = material;
	}
	
}
