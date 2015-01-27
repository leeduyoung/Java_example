package IOStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStream {

	/**
	 * BufferedOutputStream을 이용해서 text2.txt에 1~9까지 출력하는 예제
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("test2.txt");
		//BuufferedOutputStream의 버퍼 크기를 5로 한다.
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
		
		//파일 test2.txt에 1부터 9까지 출력한다.
		for(int i='1'; i<='9'; i++){
			bos.write(i);
		}
		
		fos.close();
		//bos.close(); //BufferedOutputStream을 close()하면 버퍼에 남아있던 모든 내용을 출력한다.
		//BufferedOutStream의 close()는 기반 스트림인 FileOutStream의 close()를 호출하므로 따로 호출할 필요 없다.
		
		/**
		 * 크기가 5인 BufferedOutputStream을 이용해서 파일 test2.txt에 1부터 9까지 출력하는 예제인데
		 * 결과를 보면 5까지 밖에 출력이 안되어있다.
		 * 그 이유는 버퍼에 남아있는 데이터가 출력되지 못한 상태로 프로그램이 종료되었기 때문이다.
		 * 결과적으로, 보조스트림을 사용한 경우 기반스트림의 close()나 flush()를 호출할 필요없이 단순히
		 * 보조스트림의 close()를 호출하기만 하면 된다.
		 */
		
		
	}

}
