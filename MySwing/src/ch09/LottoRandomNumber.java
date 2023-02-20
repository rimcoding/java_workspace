package ch09;

import java.util.Arrays;
import java.util.Random;

//기능
//랜덤 번호 발생하는 클래스 1~45
//get,set
// 6개 변호를 리턴하는 기능 , 정렬까지 책임
//클래스 지정할때 하나의 클래스로 만드는건 좋지 않음
//데이터타입으로 볼수 있음
public class LottoRandomNumber {
	
	final int LOTTO_NUMBER_SIXE = 6;
	
	//6개 난수 발생 배열 리턴하는 기능
	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIXE];
		Random random = new Random();
		for (int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			for(int j = 0; j <i; j++) {
				if (lottoWinNum[i] == lottoWinNum[j]) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum); 		//오름 차순
		
		return lottoWinNum;
	}
		
	}


