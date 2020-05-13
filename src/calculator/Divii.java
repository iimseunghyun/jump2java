package calculator;


public class Divii implements Operator{
	double a;
	double b;
	
	public Divii(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double oper() {
		double r = a/b;
		return r;
	}
	
}




