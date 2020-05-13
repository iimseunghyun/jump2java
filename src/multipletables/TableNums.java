package multipletables;

public class TableNums extends Numbers implements Iterations {
	
	public String iteration(int aa) {
		this.a = aa;
		String txt = "";
		for (int i = 1; i<10; i++) {
			int result = this.multiple(aa, i);
			String str = String.format("%d x %d = %d\n", aa, i, result);
			txt += str;
		}
		return txt;
	}
	public static void main(String[] args) {

	}

}
