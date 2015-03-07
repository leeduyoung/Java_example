package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListSetDemo {

	/**
	 * 리스트와 셋의 차이점
	 * 리스트는 중복을 허용한다.
	 * 셋은 중복을 허용하지 않는다.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> sarray = new ArrayList<String>();
		sarray.add("이두영");
		sarray.add("정은지");
		sarray.add("정은지");
		sarray.add("정은지");
		sarray.add("하지원");
		sarray.add("유라");
		
		for(int i=0; i<sarray.size(); i++){
			System.out.println(sarray.get(i));
		}
		
		System.out.println();
		
		Iterator sa = sarray.iterator();
		while(sa.hasNext()){
			System.out.println(sa.next());
		}
		
		System.out.println();
		
		HashSet<String> sset = new HashSet<String>();
		sset.add("이두영");
		sset.add("정은지");
		sset.add("정은지");
		sset.add("정은지");
		sset.add("하지원");
		sset.add("유라");
		
		Iterator si = sset.iterator();
		while(si.hasNext()){
			System.out.println(si.next());
		}
		
	}

}
