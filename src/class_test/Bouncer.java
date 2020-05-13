package class_test;

public class Bouncer {
//	public void barkAnimal(Animal animal) {
//		if (animal instanceof Tiger) {
//			System.out.println("어흥");
//		}else if(animal instanceof Lion) {
//			System.out.println("으르렁");
//		}
//	}
	
	public void barkAnimal(Barkable animal) {
		animal.bark();
	}
	
	public static void main(String[] args) {
//		Barkable tiger = new Tiger();	//아래와 같은결과 : 다형성
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
	}

}
