package calculator;

public class Minuss implements Operator{
	double a;
	double b;
	
	public Minuss(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double oper() {
		double r = a - b;
		return r;
	}
}
