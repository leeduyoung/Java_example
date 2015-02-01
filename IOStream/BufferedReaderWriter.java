package IOStream;

import java.io.*;

public class BufferedReaderWriter {

	/**
	 * BufferedReader / BufferedWriter는 버퍼를 이용해서 입출력의 효율을 높일 수 있도록 하는 역할
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("ArrayCopy1.java");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		for(int i=1; (line = br.readLine()) != null; i++){
			// ";"를 포함한 라인을 출력한다.
			if(line.indexOf(";") != -1){
				System.out.println(i + " : " + line);
			}
		}
		br.close();
		
		
	}

}
