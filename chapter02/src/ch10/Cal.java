package ch10;

public class Cal {
	
	
	public int sum(int n1,int n2) {
		return n1 + n2;
	}
	
	public int multiply(int n1,int n2) {
		System.out.println("부모 메서드");
		return n1 * n2;
	}
}
class Cal2 extends Cal	{
	
	public int minus(int n1,int n2) {
		return n1 - n2;
	}
	// 오버 라이드 != 오버 로딩 ()
	// 재정의한다 : 부모에 있는 메서드를 재 정의한다.
	// 조건 : 메서드 모양이 똑같아야 한다.
//	public int multiply(int n1,int n2) {
//		System.out.println("자식 메서드");
//		if (n1 == 0 || n2 ==0) {
//			System.out.println("0을 입력하였습니다.");
//		}
//		return n1 * n2;
//	}
	//sum 컨트롤 + 스페이스
	//주석 + 힌트
	@Override	//어노테이션
	public int sum(int n1, int n2) {
		System.out.println("n1 :"+n1+"을 입력 하였습니다.");
		return super.sum(n1, n2);
	}
}