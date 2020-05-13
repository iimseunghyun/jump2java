package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigOperator {
	private BigDecimal num1;
	private BigDecimal num2;


public BigOperator(BigDecimal num1, BigDecimal num2) {
	this.num1 = num1;
	this.num2 = num2;	
}

public BigDecimal operSwitch(String oper){	
	
		BigDecimal r;		
		switch(oper) {
		case "+":
			r = num1.add(num2);
			break;
			
		case "-":
			r = num1.subtract(num2);
			break;
			
		case "*":
			r = num1.multiply(num2);
			break;
			
		case "/":
			r = num1.divide(num2, 10, RoundingMode.HALF_EVEN);
			break;
		default:
			System.out.println("invalid operator");
			r = num1;
			break;
		}
		return r;
	}
	
}
	
