package calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class Writing {
	
	public void newWrite(BigDecimal data) throws IOException{
	PrintWriter pw = new PrintWriter("out3.txt");
	pw.println(data);
	pw.close();
	}
	
	public String bToString(BigDecimal num) {
		String a = String.valueOf(num);
		return a;		
	}
	
	public void afterWrite(String data) throws IOException{
		PrintWriter pw2 = new PrintWriter(new FileWriter("out3.txt", true));
		pw2.println(data);
		pw2.close();
	}
}
