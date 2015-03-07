import java.util.HashMap;
import java.util.Scanner;


public class HashMapEx1 {

	/**
	 * 1. 해쉬맵 객체 생성한다.
	 * 2. 키(아이디), 값(비밀번호) 3개 저장해 놓는다.
	 * 3. 스캐너로 아이디와 비밀번호를 입력받는다.
	 * 4. 입력한 아이디와 비밀번호가 일치한다면, 일치한다고 출력. 
	 * 5. 일치하지 않으면 일치하지 않는다고 출력.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hashMap = new HashMap();
		
		hashMap.put("leeduyoung", 1234);
		hashMap.put("asdf", 1212);
		hashMap.put("power", 3333);
		
		Scanner sc = new Scanner(System.in);
		
		String id;
		int password;
		
		System.out.print("id : ");
		id = sc.nextLine().trim(); //trim()는 양쪽에 공백제거
		
		System.out.print("password : ");
		password = sc.nextInt();
		
		System.out.println();
		
		if(hashMap.containsKey(id)){
			if(hashMap.get(id).equals(password)){
				System.out.println("id와 password가 일치하였습니다.");
			}else{
				System.out.println("password가 틀렸습니다.");
			}
			
		}else{
			System.out.println("id가 존재하지 않습니다.");
		}

	}

}
