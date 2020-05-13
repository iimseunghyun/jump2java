package examples;

public class Tri { // 삼항연산자 

	public static void main(String[] args) {
		int temp = 99;
		temp = (temp%2 == 1)? 1:0; // 참일 때 1 대입 : 거짓일 때 0 대입 
		System.out.println(temp);
	}
}
