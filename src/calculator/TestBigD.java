package calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class TestBigD {		//BigDecimal 이용으로 소수점 오류 제거
	
	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter("out2.txt");
		
		System.out.println("숫자 입력: ");
		BigDecimal num1 = s.nextBigDecimal();
		
		BigDecimal data = num1;		
		pw.println(data);
		pw.close();
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("out2.txt", true));
		String data2 = "";
				
		while(true) {
			
			System.out.println("연산자 입력(종료는 x): ");
			String oper = s.next();
			String data3 = data2 + oper;
			
			if(oper.equals("x")) {
				s.close();
				pw2.close();
				break;
			}
			
			System.out.println("숫자 입력: ");
			BigDecimal num2 = s.nextBigDecimal();
			String data4 = data3 + num2;
			pw2.println(data4);
			
			BigOperator b = new BigOperator(num1,num2);
			BigDecimal r = b.operSwitch(oper);
			num1 = r;
			
			System.out.println("="+ r);
			String data5 = "="+ r + "\n\r";
			pw2.println(data5);
		}
	}
}
