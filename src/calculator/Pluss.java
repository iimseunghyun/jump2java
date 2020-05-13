package calculator;

public class Pluss implements Operator{
	double a;
	double b;
	
	public Pluss(double a, double b) {
		this.a = a;
		this.b = b;
	}
		
	public double oper() {
		double r = a + b;
		return r;
	}

}
