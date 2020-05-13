package calculator;

import java.util.Scanner;

public class Scanning {			//호스트코드 프로그래밍, 절차지향적
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double r = 0;
		System.out.println("숫자 입력: ");
		double num1 = s.nextDouble();	
				
		System.out.println("연산자 입력: ");
		String oper1 = s.next();
		
		System.out.println("숫자 입력: ");
		double num2 = s.nextDouble();
			
		switch(oper1) {
		case "+" : r += num1 + num2;
			break;
		case "-" : r += num1 - num2;
			break;
		case "*" : r += num1 * num2;
			break;
		case "/" : r += num1 / num2;
			break;	
		}
		System.out.println(r);
		
		while(true) {
			System.out.println("연산자 입력: ");
			String oper = s.next();
			
			if(oper.equals("x")) {
				s.close();
				break;
			}
			
			System.out.println("숫자 입력: ");
			double num = s.nextDouble();
			
			switch(oper) {
			case "+" : r = r + num;
				break;
			case "-" : r = r - num;
				break;
			case "*" : r = r * num;
				break;
			case "/" : r = r / num;
				break;
			}
			System.out.println(r);

		}
	}
}
