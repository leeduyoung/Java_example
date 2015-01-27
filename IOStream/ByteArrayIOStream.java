package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayIOStream {
	public static void main(String[] args){
		/**
		 * ByteArrayIOStream을 이용해서 바이트 배열 inSrc의 데이터를 outSrc로 복사하는 예제
		 * read(), write()를 사용하기 때문에 한번에 1바이트만 읽고 쓰므로 작업효율이 떨어진다.
		 */
		
		byte[] inSrc = {123, 123, 11, 78, 1, 4, 5};
		byte[] outSrc = null;
		
		ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		int data = 0; //data가 들어올 변수
		
		//inputStream.read()의 반환값이 -1이 아니면 true // -1이면 읽을 데이터가 없으므로 false
		while((data = inputStream.read()) != -1){
			//데이터를 항상 변수에 집어 넣고 비교하고, 아래에서 저장된 데이터를 아웃스트림에 넣는다.
			System.out.print(data + " "); //inputStream.read()메소드는 읽어온 데이터를 반환한다.
			outputStream.write(data);
		}
		
		outSrc = outputStream.toByteArray(); //outStream의 내용을 byte배열 outSrc에 배열로 반환
		
		System.out.println();
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		//java.util.Arrays.toString()은 배열의 내용을 쉽게 출력할 수 있게 해준다.
		
		for(int i=0; i<outSrc.length; i++){
			System.out.print(outSrc[i]+" ");
		}
		
	}
}
