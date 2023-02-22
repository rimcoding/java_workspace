package ch05;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapMainTest {

	public static void main(String[] args) {
		
		Map map;
		// key와 value 구조로 데이터를 저장한다.
		//Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map1 = new HashMap<>(); 		// v = null 값 허용
		Hashtable<String,String> map2 = new Hashtable<>(); 	// v = null 값 허용 안함 !
		
		//C R U D
		map1.put("A01", "김포공항전문");
		map1.put("A02", "김포공항후문");
		map1.put("A03", "김포공항로비");
		map1.put("B01", "인천공항전문");
		map1.put("B02", "인천공항후문");
		map1.put("B03", "인천공항로비");
		map1.put("C01", null);
		
		// map 자료구조에 전체 값 확인하기
		System.out.println(map1);
		
		//값 꺼내는 방법 - key 값을 통해서 값을 꺼낼 수 있다.
		System.out.println(map1.get("B03"));
		System.out.println(map1.get("C01"));
		System.out.println(map1.get("b01")); 	//없는 key 값을 요청하면 null 이 반환
		
		// 사이즈 확인
		System.out.println("size : " + map1.size());
		
		for(int i = 0; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		
		// map 원래 순서가 없지만 잠깐 응용을 하면 key 값으로 for문 정도는 활용할 수 있다.
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		map3.put(4, "E");
		
		for(int i = 0; i <map3.size(); i++) {
			System.out.println(" value : "+map3.get(i));
		}
		
		// 삭제 하는 방법
		map1.remove("C01"); 	//키값이 맞으면 삭제
		//map1.clear(); //전체삭제
		System.out.println(map1.toString());
		
		//자료구조는 반복문과 if문을 많이 활용되어 진다.
		// map 계열을 for 문과 활용하는 방법
		
		//Entry<String, String> entry1 = (Entry<String, String>) map1.entrySet();
		
		// Entry는 key, value 한번에 꺼낼수 있다  (반복하면서)
		
		for(Entry<String, String> entry1 : map1.entrySet()) {
			System.out.println("key : " + entry1.getKey());
			System.out.println("Value : " + entry1.getValue());
		}
		
		System.out.println("----------------------");
		
		System.out.println(map1.keySet().size());
		// map 값을 꺼낼 때 key값으로 접근 --> value
		//String str =  map1.get("A01");
		
		for(String key : map1.keySet()) {
			System.out.println("str : " + key); 	//반복 돌면서 key값 확인
			System.out.println("value : " + map1.get(key));
		}
	}	//end of main
}	//end of class
