package calculator;

public class Multii implements Operator{
	double a;
	double b;
	
	public Multii(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double oper() {
		double r = a*b;
		return r;
	}

}
