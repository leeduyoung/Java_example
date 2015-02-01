package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamRW {

	/**
	 * InputStreamReader / Writer는 바이트기반 스트림을 문자기반 스트림으로 연결시켜주는 역할을 한다.
	 * 바이트기반 스트림의 데이터를 지정된 인코딩의 문자데이터로 변환하는 작업을 수행
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String line = "";
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("사용중인 OS의 인코딩은 : " + isr.getEncoding());
		do{
			System.out.println("문장을 입력하세요. (마치려면 q 입력)");
			line = br.readLine();
			System.out.println("입력하신 문장 : " + line);
		}while(!line.equalsIgnoreCase("q"));
		
		//br.close(); //System.in과 같은 표준입출력은 닫지 않아도 된다.
		System.out.println("프로그램을 종료합니다.");
		
	}

}
