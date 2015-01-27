package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIOStream2 {

	/**
	 * ByteArrayIOStream을 이용해서 바이트 배열 inSrc의 데이터를 outSrc로 복사하는 예제 
	 * 배열을 사용해서 입출력 작업이 보다 효율적으로 이루어지도록 했다.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		//읽어 온 데이터를 배열 temp에 담는다.
		inputStream.read(temp, 0, temp.length);
		System.out.println(inputStream.read(temp, 0, temp.length)); //읽어온 데이터의 갯수를 반환한다.
		
		//temp의 데이터를 write한다.
		outputStream.write(temp);
		
		outSrc = outputStream.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		System.out.println("temp Source : " + Arrays.toString(temp));
		//이전 예제와는 달리 byte배열을 사용해서 한번에 배열의 크기만큼 읽고 쓸 수 있다. 
		//배열을 이용한 입출력은 작업의 효율을 증가시키므로 가능하면 입출력 대상에 따라 알맍은 크기의 배열을 사용하는 것이 좋다.
		


	}

}
