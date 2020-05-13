package jump2java;

public class SumEx2 {

	public static void main(String[] args) {
		int[] arr = {100, 82, 23, 56, 452, 55, 62, 46, 28, 11};
		int sum = 0;
		
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];			
		}
		System.out.println("총합:" + sum);
		System.out.println("평균:" + sum/(float)arr.length);
	}

}
