package IOStream;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class FileEx2 {

	/**
	 * @param args
	 * 현재 디렉토리에 속한 파일과 디렉토리의 이름과 크기 등의 상세정보를 보여주는 예제.
	 * + 추가 : 파일의 예제를 정렬해서 보여주는 기능 추
	 */
	public static void main(String[] args) {
		
		System.out.println("USAGE : Java FileEx2 Option");
		System.out.println("t     Time ascending sort.");
		System.out.println("T     Time decending sort.");
		System.out.println("l     Length ascending sort.");
		System.out.println("L     Length decending sort.");
		System.out.println("n     Name ascending sort.");
		System.out.println("N     Name decending sort.");
				
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정렬 방식을 입력하시오.(t/T, l/L, n/N)");
		String scanf = sc.next();
		final char option = scanf.charAt(0);
		
		Comparator comp = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
					
				long time1 = ((File)o1).lastModified();
				long time2 = ((File)o2).lastModified();
				
				long length1 = ((File)o1).length();
				long length2 = ((File)o2).length();
				
				//비교할꺼기 때문에 toLowerCase를 하나 toUpperCase를 하나 동일한 결과
				String name1 = ((File)o1).getName().toLowerCase();
				String name2 = ((File)o2).getName().toLowerCase();
				
				int result = 0;
				
				switch(option){
				case 't':
					if(time1 - time2 > 0)
						result = 1;
					else if(time1 - time2 == 0)
						result = 0;
					else if(time1 - time2 < 0)
						result = -1;
					break;
					
				case 'T':
					if(time1 - time2 > 0)
						result = -1;
					else if(time1 - time2 == 0)
						result = 0;
					else if(time1 - time2 < 0)
						result = 1;
					break;
					
				case 'l':
					if(length1 - length2 > 0)
						result = 1;
					else if(length1 - length2 == 0)
						result = 0;
					else if(length1 - length2 < 0)
						result = -1;
					break;
					
				case 'L':
					if(length1 - length2 > 0)
						result = -1;
					else if(length1 - length2 == 0)
						result = 0;
					else if(length1 - length2 < 0)
						result = 1;
					break;
					
				case 'n':
					result = name1.compareTo(name2);
					//name1보다 name2가 더 크면 -1 / 더 작으면 1 / 같으면 0 
					break;
					
				case 'N':
					result = name2.compareTo(name1);
					break;
				}
				
				return result;
			}
			public boolean equals(Object o){
				return false; //not used
			}
		};
		
	
		
		File dir = new File("./src");
		File[] files = dir.listFiles();
		
		Arrays.sort(files, comp);
		
		for(int i=0; i<files.length; i++){
			File f = files[i];
			String name = f.getName();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()){
				attribute = "DIR";
			}else{
				size = f.length() + "";
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
			}
			
			System.out.printf("%s %3s %6s %s\n", sdf.format(new Date(f.lastModified())), attribute, size, name);
			
		}
		
		
		
	}

}
