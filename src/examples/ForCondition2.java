package examples;

public class ForCondition2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if (i%2 == 1) {
				System.out.println(i);
				int a = i*i;
				sum += a;
				System.out.println(a);
			}
		}
		System.out.println(sum);
	}

}
