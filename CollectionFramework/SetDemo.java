package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(2);
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println("A집합에 B의 원소가 모두 포함되어 있느냐? : " + A.containsAll(B));
		System.out.println("A집합에 C의 원소가 모두 포함되어 있느냐? : " + A.containsAll(C));
		
		//A.addAll(B); //A와 B의 합집합
		//A.retainAll(B); //A와 B의 교집합
		A.removeAll(B); //A와 B의 차집합
		
		Iterator i = A.iterator();
		while(i.hasNext()){
			System.out.print(i.next() + " ");
		}
		
		
	}

}
