package examples_object;

public class GetHouseDog extends GetDog{
	
	public void sleep() { //overriding
		System.out.println(this.name + " zzz in house");
	}
	public static void main(String[] args) {
		GetHouseDog housedog = new GetHouseDog();
		housedog.setName("poppy");
		housedog.sleep();
	}

}
