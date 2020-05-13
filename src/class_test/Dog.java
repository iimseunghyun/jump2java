package class_test;

public class Dog extends Animal { //Inheritance	: Dog IS-A Animal
	public void sleep() {
		System.out.println(this.name+" zzz");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("poppy");
		dog.sleep();
	}
}
