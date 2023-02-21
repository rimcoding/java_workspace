package ch05;


import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;

public class SetMainTest2 {

	public static void main(String[] args) {


		HashSet<Integer> numberSet = new HashSet<>();
		numberSet.add(getRandomNumber());
		numberSet.add(getRandomNumber());
		numberSet.add(getRandomNumber());
		numberSet.add(getRandomNumber());
		numberSet.add(getRandomNumber());
		numberSet.add(getRandomNumber());
		System.out.println(numberSet.size());
		System.out.println(numberSet.toString());
		
		
	}	//end of main

	public static int getRandomNumber() {
		
		Random random = new Random();
		//int value = random.nextInt(45) + 1;
		return random.nextInt(45) + 1 ;
		
	}
	
} //	end of class
