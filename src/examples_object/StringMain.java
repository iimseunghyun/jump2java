package examples_object;

public class StringMain {

	public static void main(String[] args) {
		String city1 = "Asia"; //리터럴
		String city2 = "Europe";
		String city3 = new String("Asia"); //객체
		String city7 = "Asia"; //리터럴
		
		System.out.println(city1);
		System.out.println(city1.length());
		System.out.println(city1==city2);
		System.out.println(city1.equals(city2));
		System.out.println(city1 == city3); //참조값이 다름 : 새로운 객체이기 때문.
		System.out.println(city1 == city7); //참조값이 같음 
		System.out.println(city1.equals(city3)); //true
		System.out.println(city1.equals(city7)); //true
	}

}
