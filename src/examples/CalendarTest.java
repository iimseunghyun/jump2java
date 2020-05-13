package examples;

import java.util.Date;

public class CalendarTest {

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();	// 1970.1.1 경과시간  1/1000
		System.out.println(millis/1000/60/60/24); //몇일 경과
		
		Date d = new Date();
		System.out.println(d);
		Date dd = new Date(d.getTime()+1000/60/60/24); //하루
		System.out.println(dd);		
	}

}
