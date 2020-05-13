package examples;

import java.util.Scanner;

public class InOutMethod {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in); //통채로 암기 
		
		System.out.println("정수를 입력하세요.");
		int choice = scann.nextInt(); //nextInt
		System.out.println(choice);
		
		System.out.println("문자열을 입력하세요.");
		String schoice = scann.next(); //next
		System.out.println(schoice);
	
		scann.close();
	}

}
