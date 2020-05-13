package examples;

import java.util.Calendar;
import java.util.Date;

public class ObjectType {

	public static void main(String[] args) {
		//배열
		int[] m = {1, 2, 3};
		int[] n = new int[] {1,2,3};
		//참조
		String card = "H8";
		Date d = new Date();
		Calendar cal = Calendar.getInstance();
		
		System.out.println(card);
		System.out.println(d);
		System.out.println(cal);
	}

}
