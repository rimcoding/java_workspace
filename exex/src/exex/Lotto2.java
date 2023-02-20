package exex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Lotto2 {

	public static void main(String[] args) {

		int LottoNumber[] = new int [6];
		Random random = new Random();
		
		//반복 거르기
		for (int i = 0; i < LottoNumber.length; i++) {
			LottoNumber[i] = random.nextInt(45)+1;
			for (int j = 0; j < i; j++) {
				if (LottoNumber[i]==LottoNumber[j]) {
					i--;
					break;
				}
			}
		}
		//오름차순
		for (int i = 0; i < LottoNumber.length; i++) {
			for (int j = 0; j < LottoNumber.length; j++) {
				if (LottoNumber[i] <LottoNumber[j]) {
					int temp = LottoNumber[i];
					LottoNumber[i] = LottoNumber[j];
					LottoNumber[j] = temp;
				}
			}
		}
		System.out.println("로또번호"+Arrays.toString(LottoNumber));
		
	}

}
