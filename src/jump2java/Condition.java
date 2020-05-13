package jump2java;

public class Condition {

	public static void main(String[] args) {
		int money = 2000;
		if(money >= 3000) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		int money2 = 2000;
		boolean hasCard = true;
		if (money>=3000 || hasCard) {
			System.out.println("택시를 타고 가라");
		}else {
			System.out.println("걸어가라");
		}
		
		
	}

}
