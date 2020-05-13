package calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test { //인터페이스 구현 연습, 소수점 오류 존재함.

	public double operate(Operator o) { 
		return o.oper();
	}
	public static void main(String[] args) throws IOException{
		Test t = new Test();
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter("out.txt");         
            
		System.out.println("숫자 입력: ");
		double num1 = s.nextDouble();
		
		double data = num1;
		pw.println(data);
		pw.close();
        
		double r = 0;

		PrintWriter pw2 = new PrintWriter(new FileWriter("out.txt", true));
		String data2 = "";
		while(true) {
			
			System.out.println("연산자 입력(종료는 x: ");
			String oper = s.next();		
			String data3 = data2 + oper;
			
			
			if(oper.equals("x")) {	// == 은 !참조값! 비교.
				s.close();
				pw2.close();
				break;
			}
			
			System.out.println("숫자 입력: ");
			double num2 = s.nextDouble();
			String data4 = data3 + num2;
			pw2.println(data4);
			
			switch(oper) {
			case "+" : 
				Pluss plus = new Pluss(num1,num2);
				r =t.operate(plus);
				num1 = r;
				break;
			case "-" : 
				Minuss minus = new Minuss(num1,num2);
				r = t.operate(minus);
				num1 = r;
				break;
			case "*" : 
				Multii multi = new Multii(num1,num2);
				r = t.operate(multi);
				num1 = r;
				break;
			case "/" :
				Divii divi  = new Divii(num1, num2);
				r = t.operate(divi);
				num1 = r;
				break;
			}
			System.out.println("="+ r);
			String data5 ="=" + r + "\n\r";
			pw2.println(data5);
		}
	}

}
