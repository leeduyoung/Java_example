package Interface2;

public interface Calculatable {

	/**
	 * 계산기 알고리즘을 만드는 개발자 A와 알고리즘을 사용하는 로직을 구현하는 개발자 B사이의 약속을 기술.
	 * 인터페이스에 포함된 함수들이나 변수(멤버)들은 모두 public으로 선언되어야 한다.
	 */
	
	public void setOprands(int num1, int num2, int num3);
	
	public int sum();
	public int minus();
	public double avg();
	public int mul(); 
	
}
