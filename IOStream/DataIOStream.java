package IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataIOStream {

	/**
	 * DataOutputStream 
	 * @param args
	 * @throws IOException 
	 */
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		FileOutputStream fos = new FileOutputStream("test2.txt");
//		DataOutputStream dos = new DataOutputStream(fos);
//		
//		dos.writeUTF("DataOutputStream을 통한 출력");
//		dos.writeChar(65);
//		dos.writeInt(5);
//		dos.writeFloat(4.4f);
//		//출력된 값들은 이진데이터로 표현된다.
//		
//		dos.close();
//		
//	}

	/**
	 * DataInputStream
	 * @throws IOException 
	 * 사실 DataOutputStream에 어떻게 저장되 있는지 몰라도 기록된 데이터를 DataInputStream의 read메서드로 읽어오면 된다.
	 * 하지만 읽어올 때는 반드시 쓰인 순대로 읽어야 한다.
	 */
	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream("test2.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readUTF());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		

	}
}
