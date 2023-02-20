package ex;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

		public int[] createNumber() {
			int LottoNumber[] = new int[6];
			Random random = new Random();	
			//반복하는 숫자 빼기
			for (int i = 0; i < LottoNumber.length; i++) {
				LottoNumber[i]=random.nextInt(45)+1;
				for (int j = 0; j < i; j++) {
					if (LottoNumber[i]==LottoNumber[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < LottoNumber.length; i++) {
				for (int j = 0; j < LottoNumber.length; j++) {
					if (LottoNumber[i] < LottoNumber[j]) {
						int temp = LottoNumber[i];
						LottoNumber[i] = LottoNumber[j];
						LottoNumber[j] = temp;
					}
				}
			}
			return LottoNumber;
		}
		
		public static void main(String[] args) {
			Lotto lottotest = new Lotto();
			int[] lottoNumber = lottotest.createNumber();
				System.out.print("로또번호"+"["+"\f");
			for (int i = 0; i < lottoNumber.length; i++) {
				System.out.print(lottoNumber[i]+"\f");
			}
			System.out.print("]");
			
		}
		
	}
		


