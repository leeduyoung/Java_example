package IOStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIOStream {

	/**
	 * 1. command라인으로부터 입력받은 파일의 내용을 읽어서 그대로 화면에 출력
	 * 2. test.txt file 내용을 test2.txt file로 복사
	 * 3. 문자기반 스트림인 Reader / Writer는 유니코드간의 변환을 자동적으로 처리해 준다.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		/*
		//1번 예제
		FileInputStream fis = new FileInputStream("./test.txt");
		int data = 0;
		while((data = fis.read()) != -1){
			char c = (char)data;
			System.out.println(c);
		}
		*/
		
		/*
		//2번 예제
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("test2.txt");
		
		int data = 0;
		while((data = fis.read()) != -1){
			fos.write(data);
		}
		fis.close();
		fos.close();
		*/
		
		//3번 예제
		FileInputStream fis = new FileInputStream("test.txt");
		FileReader fr = new FileReader("test.txt");
		
		int data = 0;
		
		//FileInput의 경우 한글은 깨져서 보인다.
		while((data = fis.read()) != -1){
			System.out.println((char)data);
		}
		System.out.println();
		fis.close();
		
		//FileReader의 경우 한글도 잘 출력된다.
		while((data = fr.read()) != -1){
			System.out.println((char)data);
		}
		System.out.println();
		fr.close();
		
	}

}
