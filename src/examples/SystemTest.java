package examples;

public class SystemTest {

	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);
		for(int i =0; i<100000; i++) {
			System.out.println("1");
		}
		long ltime2 = System.currentTimeMillis();
		System.out.println(ltime2-ltime);

	}

}
