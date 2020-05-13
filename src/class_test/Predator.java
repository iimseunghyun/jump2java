package class_test;

//public abstract class Predator extends Animal{ //추상클래스 
//	public abstract String getFood(); //추상 메소드 : 이를 상속하는 클래스에서 반드시 구현돼야함
//
//	public boolean isPredator(){// 추상클래스에 실제 메소드 추가 
//		return true;	
//	}
//}
public interface Predator {
	public String getFood();
//	public static void main(String[] args) { 인터페이스에서 static 메소드 선언 불가능 
//	}

}
