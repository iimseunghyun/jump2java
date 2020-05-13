package examples_object;

public class GetSet_ {
	String name;
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public static void main(String[] args) {
		GetSet_ getset = new GetSet_();
		getset.setName("namesetting");
		System.out.println(getset.name);
		
		String a = getset.getName();
		System.out.println(a);
	}

}
