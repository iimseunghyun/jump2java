package class_test;

public class Leopard extends Animal implements Predator,Barkable{
	public String getFood() {
		return "orange to leopard";
	}
	public void bark(){
		System.out.println("캬옹");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
