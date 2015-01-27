package IOStream;

import java.util.Date;

public class PrintStreamEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 65;
		float f = 1234.5678f;
		Date d = new Date();
		
		System.out.printf("문자 %c의 코드는 %d\n", i, i);
		System.out.printf("%d는 8진수로 %o, 16진수로 %x\n", i, i, i);
		System.out.printf("%3d%3d%3d\n", 100, 90, 80);
		System.out.println();
		System.out.printf("12345678901234567890\n");
		System.out.printf("%s%-5s%5s\n", "123", "123", "123");
		System.out.printf("\n");
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다.\n", d,d,d,d);
		System.out.printf("지금은 %tH시 %tM분 %tS초 입니다.\n", d,d,d,d);
		
		
	}

}
