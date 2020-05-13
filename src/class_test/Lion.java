package class_test;

public class Lion extends Animal implements Predator,Barkable{
	public String getFood() {
		return "banana to lion";
	}
	public void bark(){
		System.out.println("으르렁");
	}

	public static void main(String[] args) {

	}

}
