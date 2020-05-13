package examples_object;

public class GetDog extends GetSet {

	public void sleep() {
		System.out.println(this.getName() + " zzz");
	}
	public static void main(String[] args) {
		GetSet getset = new GetSet();	//클래스 불러올 수 있음
		getset.setName("namesetting");
		String name = getset.getName();
		System.out.println(name);
		//getset.sleep();	메서드 없음
		
		GetDog dog = new GetDog();
		dog.setName("poppy");
		name = dog.getName();
		//String name2 = dog.getName();
		System.out.println(name);		
		dog.sleep();
	}
}
