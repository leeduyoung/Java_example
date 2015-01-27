package IOStream;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.StringWriter;

public class PipedReaderWriter {

	/**
	 * PipedReader / Writer는 스레드 간에 데이터를 주고 받을 때 사용한다.
	 * 두 스레드가 서로 메시지를 주고 받는 예제
	 * @param args
	 */
	public static void main(String[] args) {
	
		InputThread it = new InputThread("InputThread");
		OutputThread ot = new OutputThread("OutputThread");
		
		//PipedReader와 PipedWriter를 연결한다. 둘 중 하나만 연결
		//it.connect(ot.getOutput());
		ot.connect(it.getInput());
		
		it.start();
		ot.start();
	}

}

class InputThread extends Thread{
	PipedReader input = new PipedReader();
	StringWriter sw = new StringWriter();
	
	InputThread(String name){
		super(name); //Thread(String name)
	}
	
	public void run(){
		int data = 0;
		
		try {
			while((data = input.read()) != -1){
				sw.write(data); //읽어온 data값을 sw객체에 넣음.
			}
			System.out.println(getName() + "reveived : " + sw.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PipedReader getInput(){
		return input;
	}
	
	public void connect(PipedWriter output){
		try {
			input.connect(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class OutputThread extends Thread{
	PipedWriter output = new PipedWriter();
	
	OutputThread(String name){
		super(name);
	}
	
	public void run(){
		String msg = "hello";
		System.out.println(getName() + " sent : " + msg);
		try {
			output.write(msg);
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public PipedWriter getOutput(){
		return output;
	}
	
	public void connect(PipedReader input){
		try {
			output.connect(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
