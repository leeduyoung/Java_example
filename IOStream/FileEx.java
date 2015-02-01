package IOStream;

import java.io.File;

public class FileEx {

	/**
	 * 지정한 디렉토리에 포함된 파일과 디렉토리의 목록을 보여주는 예제
	 * @param args
	 * (수정)현재 디렉토리에 속한 파일과 디렉토리의 이름과 크기 등의 상세정보를 보여주는 예제
	 */
	public static void main(String[] args) {
		
		//File f = new File("/Users/leedu/Documents/workspace/test2/./src");
		File f = new File("./src"); //(현재위치)상대경로
		//System.out.println("경로를 포함한 파일이름 : " + f.getPath()); //경로를 포함한 파일이름
		System.out.println("절대경로" + f.getAbsolutePath()); //절대경로
		//System.out.println(f.getParent()); //파일이 속해 있는 디렉토리
		
		if(!f.exists() || !f.isDirectory()){ 
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		
//		File[] files = f.listFiles();
//		for(int i=0; i<files.length; i++){
//			String fileName = files[i].getName();
//			System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
//		}
		
		File[] files = f.listFiles();
		
	}

}
