package examples;

public class forCondition {

	public static void main(String[] args) {
		int sum = 0;
		for(int i =1; i<101; i++) {
			if (i % 2 == 1) {
				//System.out.println(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
