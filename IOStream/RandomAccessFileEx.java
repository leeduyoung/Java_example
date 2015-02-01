package IOStream;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {

	/**
	 * 입력과 출력을 모두 할 수 있다.
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException, EOFException {
		
		/*
		//RandomAccessFile(File file, String mode) - read, write를 할 수 있다.
		RandomAccessFile raf = new RandomAccessFile("test3.dat", "rw");
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		raf.writeInt(100); //int - 4byte
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		raf.writeLong(100L); //long - 8byte
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		*/
		
		int[] score = { 1, 80, 90, 100,
			            2, 20, 40, 80,
			            3, 100, 70, 30 };
		
		RandomAccessFile raf2 = new RandomAccessFile("test4.dat", "rw");
		
		for(int i=0; i<score.length; i++){
			raf2.writeInt(score[i]);
		}
		
		raf2.seek(0); //파일포인터의 위치를 옮기지 않으면, 마지막에 있으므로 아무것도 출력되지 않는다.
		
		while(true){
			System.out.println(raf2.readInt());
		}
		
	}

}
