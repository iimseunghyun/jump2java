package examples;

public class Foreach {
	public static void print(int ... mm) { //가변인자 ...의 사용
		for (int m:mm) {
			System.out.println(m+"\n");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[]mm = {1,6,16,22,33,56};
		print(mm);
		
		int a=1, b=6, c=16;
		print(a);
		print(a,b);
		print(a,b,c);
		
	}

}
