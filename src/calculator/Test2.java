package calculator;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Test2 {	//최종

	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		Writing writer = new Writing();
		
		System.out.println("숫자 입력: ");
		BigDecimal num1 = s.nextBigDecimal();
		
		writer.newWrite(num1);
		
		while(true) {			
			System.out.println("연산자 입력(종료는 x): ");
			String oper = s.next();
			
			writer.afterWrite(oper);
			
			if(oper.equals("x")) {
				s.close();
				break;
			}
			
			System.out.println("숫자 입력: ");
			BigDecimal num2 = s.nextBigDecimal();
			
			String num2s = writer.bToString(num2);
			writer.afterWrite(num2s);
			
			BigOperator b = new BigOperator(num1,num2);
			BigDecimal r = b.operSwitch(oper);
			num1 = r; 	//객체화 가능??
			
			String rs = "="+writer.bToString(r);
			writer.afterWrite(rs);
			
			System.out.println("="+ r);
		}
	}
}
