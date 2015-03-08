package Interface2;

public class Calculator implements Calculatable{

	int first, second, third;
	
	@Override
	public void setOprands(int num1, int num2, int num3) {
		
		this.first = num1;
		this.second = num2;
		this.third = num3;
		
	}

	@Override
	public int sum() {
		return this.first + this.second + this.third;
	}

	@Override
	public int minus() {
		return this.first - this.second - this.third;
	}

	@Override
	public double avg() {
		return (double)sum()/3;
	}

	@Override
	public int mul() {
		return this.first * this.second * this.third;
	}

}
