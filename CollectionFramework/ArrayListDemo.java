package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사이즈를 모를경우 사용하기 힘들다.
		String[] array = new String[2];
		array[0] = "one";
		array[1] = "two";
		//array[2] = "three"; //error
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
		
		//컬렉션프레임워크 arraylist 사용 - 사이즈 설정 안해도 된다.
		ArrayList arraylist = new ArrayList();
		arraylist.add("one");
		arraylist.add("two");
		arraylist.add("three");
		
		for(int i=0; i < arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
		
	}

}
