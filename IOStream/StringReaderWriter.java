package IOStream;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderWriter {

	/**
	 * 입출력 대상이 메모리인 스트림.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		//input에 있는 데이터를 읽어온다.
		while((data = input.read()) != -1){
			//output에 데이터를 쓴다.
			output.write(data);
		}
		
		//StringBuffer.getBuffer() : StringWriter에 출력한 데이터가 저장된 StringBuffer를 반환
		//String.toString : StringWriter에 출력된(StringBuffer에 저장된) 문자열을 반환
		
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " +output.getBuffer().toString());
		//System.out.println(output.toString());
		
	}

}
