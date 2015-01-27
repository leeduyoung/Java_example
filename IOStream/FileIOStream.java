package IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	/**
	 * 1. command라인으로부터 입력받은 파일의 내용을 읽어서 그대로 화면에 출력
	 * 2. test.txt file 내용을 test2.txt file로 복사
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
		
		//2번 예제
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("test2.txt");
		
		int data = 0;
		while((data = fis.read()) != -1){
			fos.write(data);
		}
		fis.close();
		fos.close();
		
	}

}
