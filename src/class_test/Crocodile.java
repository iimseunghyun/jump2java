package class_test;

public class Crocodile extends Animal implements Predator,Barkable{
	public String getFood() {
		return "strawberry to crocodile";
	}
	public void bark(){
		System.out.println("쩝쩝");
	}

	public static void main(String[] args) {

	}

}
