package Interface2;

public class CalculatorConsumer {

	/**
	 * @param args
	 * 계산기 알고리즘 - Calculator 클래스
	 * 계산기 임시 알고리즘 - CalculatorDummy 클래스
	 * 개발자 A와 개발자 B사이의 약속을 기술하는 인터페이스 - Calculatable 인터페이스
	 * 계산기 알고리즘을 개발하는 개발자 A
	 * 계산기 알고리즘을 이용한 로직을 개발하는 개발자 B
	 * 인터페이스는 약속의 역할을 한다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//개발자 B가 개발자 A의 계산기 알고리즘 클래스를 받지 못했을때. > 계산결과는 모두 0
//		CalculatorDummy cd = new CalculatorDummy();
//		cd.setOprands(30, 20, 10);
//		System.out.println("합 : " + cd.sum());
//		System.out.println("차 : " + cd.minus());
//		System.out.println("곱 : " + cd.mul());
//		System.out.println("평균 : " + cd.avg());
		
		//개발자가 B가 개발자 A의 계산기 알고리즘 클래스를 받았을때. > 제대로 된 계산결과가 나온다.
		Calculator cal = new Calculator();
		cal.setOprands(30, 20, 10);
		System.out.println("합 : " + cal.sum());
		System.out.println("차 : " + cal.minus());
		System.out.println("곱 : " + cal.mul());
		System.out.println("평균 : " + cal.avg());
		
	}

}
