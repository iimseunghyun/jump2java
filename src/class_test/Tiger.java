package class_test;

//public class Tiger extends Predator implements Barkable{ //추상클래스 Predator
public class Tiger extends Animal implements Predator,Barkable{
	public String getFood() {
		return "apple to tiger";
	}
	public void bark(){
		System.out.println("어흥");
	}
	public static void main(String[] args) {

	}

}
