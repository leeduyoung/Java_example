package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("one", 1);
		hmap.put("two", 2);
		hmap.put("three", 3);
		hmap.put("four", 4);
		
//		System.out.println(hmap.size());
//		System.out.println(hmap.get("one"));
//		System.out.println(hmap.get("two"));
		
		//HashMap 반복처리 방법
		iteratorUsingForEach(hmap);
		iteratorUsingIterator(hmap);
		
/*
		//반복문의 두가지 방법
		int[] ia = new int[10];
		ia[0] = 0;
		ia[1] = 1;
		ia[2] = 2;
		ia[3] = 3;
		ia[4] = 4;
		ia[5] = 5;
		
		for(int i=0; i<ia.length; i++){
			System.out.print(ia[i] + " ");
		}
		
		System.out.println();
		
		for (int k : ia) {
			System.out.print(k + " ");
		}
*/
	}
	
	/**
	 * Map에 저장된 데이터를 열거하는 방법
	 * 메소드 entrySet은 Map의 데이터를 담고 있는 Set을 반환한다.
	 * 반환한 Set의 값이 사용할 데이터 타입은 Map.Entry이다.
	 * Map.Entry는 인터페이스인데 getKey, getValue를 가지고 있다.
	 * @param map
	 */
	
	static void iteratorUsingForEach(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries){
			 System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
	static void iteratorUsingIterator(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entries.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
