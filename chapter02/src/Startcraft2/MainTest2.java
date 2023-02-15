package Startcraft2;

public class MainTest2 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("저글링킬러");
		Marine marine1 = new Marine("보너스마린");
		
		// 질럿이 마린을 공격 - 대상 1, 2
		for (int i = 0; i < 16; i++) {
			zealot1.attackMarine(marine1);
		}
		
		marine1.attackZealot(zealot1);
		System.out.println(zealot1.gethp());
		marine1.attackZealot(zealot1);
		System.out.println(zealot1.gethp());
		marine1.attackZealot(zealot1);
		System.out.println(zealot1.gethp());
		
		
	}

}
