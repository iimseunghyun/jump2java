package examples_object;

public class GetSet {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		GetSet getset = new GetSet();
		getset.setName("setter");
		String name = getset.getName();
		System.out.println(name);
	}

}
