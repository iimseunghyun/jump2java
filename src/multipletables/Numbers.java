package multipletables;

public class Numbers {
	int a;
	int b;
	int c;
	
	public int multiple (int aa, int bb) {
		this.a = aa;
		this.b = bb;
		this.c = aa*bb;
//		System.out.printf("%d x %d = %d",this.a, this.b, this.c);
		return this.c;
	}
	
	public static void main(String[] args) {

	}

}
