package ex13;

public class MainTest2 {

	public static void main(String[] args) {
		  int[] myNumbers = new int[10];
	        myNumbers[0]  = 10; 
	        myNumbers[1]  = 4; 
	        myNumbers[2]  = 100; 
	        myNumbers[3]  = 23; 
	        myNumbers[4]  = 51; 
	        myNumbers[5]  = 1; 
	        myNumbers[6]  = 6; 
	        myNumbers[7]  = 88; 
	        myNumbers[8]  = 42; 
	        myNumbers[9]  = 31; 
	        
	        
	        // 오름 차순으로 정렬 해주세요 
	        // for , if 문 활용
	        for(int i=0; i<myNumbers.length-1; i++) {
	        	for(int j=0; j<myNumbers.length-1; j++) {
	        		if(myNumbers[j] < myNumbers[j+1]) {
	        			//계속 비교해서 적은값이 남게 만들어라
	        			int min = myNumbers[j];
	        		}
	        		System.out.println();
	        	}
	        }
}
}
