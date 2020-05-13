package class_test;

public class HouseDog extends Dog{
	public HouseDog() {
		//입력값 없는 default생성자 가능(생성자 없을 때 자동생성되는 메서드)
	}
	
	public HouseDog(String name) { // 생성자  : 클래스명과 메소드명 동일, 리턴타입 자체가 없다. 
		this.setName(name);
	}
	
	public HouseDog(int type) { //생성자 오버로딩
		if (type == 1) {
			this.setName("yorkshire");
		}else if(type == 2){
			this.setName("bulldog");
		}
	}
	
	public void sleep() { //Method overriding (seems like overwriting)
		System.out.println(this.name+" zzz in house");
	}
	
	public void sleep(int hour) {  //Method  overloading : 입력값이 다른 메소드 기능 추가 
		System.out.println(this.name+ " zzz in house for " + hour + " hours");
	}
	public static void main(String[] args) {
		HouseDog housedog = new HouseDog("happy");
		//houseDog.setName("happy");
		HouseDog housedog2 = new HouseDog();
		housedog.sleep();
		housedog.sleep(3);
		HouseDog yorkshire = new HouseDog(1);
		System.out.println(housedog.name);
		System.out.println(yorkshire.name);
		
	}
}
