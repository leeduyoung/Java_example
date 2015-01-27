package IOStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayIOStream3 {

	/**
	 * ByteArrayIOStream을 이용해서 바이트 배열 inSrc의 데이터를 outSrc로 복사하는 예제 
	 * 배열을 사용해서 입출력 작업이 보다 효율적으로 이루어지도록 했다.
	 * temp 배열의 크기가 작을땐 읽어 온 데이터의 개수만큼만 write하게 해야 한다.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; //10개의 데이터
		byte[] outSrc = null;
		byte[] temp = new byte[4]; //4개의 데이터가 들어갈 수 있는 배열
		
		ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		//available()메소드는 읽어올 수 있는 바이트 수를 반환한다.
		while(inputStream.available() > 0){
			int len = inputStream.read(temp); //len변수에 읽어온 데이터의 개수를 저장한다.
			//inputStream.read(temp)는 inputStream의 데이터를 temp배열로 읽어오고 읽어온 데이터의 갯수를 반환한다.
			outputStream.write(temp, 0, len); //outputStream에 temp에 있는 데이터를 읽어온 만큼 wirte한다.
			System.out.println(len);
		}
		
		outSrc = outputStream.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		System.out.println("temp Source : " + Arrays.toString(temp));
	}

}
