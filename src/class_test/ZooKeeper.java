package class_test;

public class ZooKeeper {
//	public void feed(Tiger tiger) { //인터페이스 생성 전 
//		System.out.println("feed apple to tiger");
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("feed banana to lion");
//	}
//	
//	public void feed(Crocodile crocodile) {
//		System.out.println("feed strawberry to crocodile");
//	}
	
	public void feed(Predator predator) {
		System.out.println("feed " + predator.getFood()); 
	}
	
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
//		Predator predator = new Tiger() // 아래와 같은결과 : 다형성
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		Crocodile crocodile = new Crocodile();
		Leopard leopard = new Leopard(); //ZooKeeper 이후 추가 될 때
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		zooKeeper.feed(crocodile);
		zooKeeper.feed(leopard);
	}

}
