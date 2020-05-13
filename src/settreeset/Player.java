package settreeset;

public class Player { //public class Player implements Comparable<Player>{
	private String name;
	private String nation;

	public Player(String name) {
		this(name, "");
	}
	
	public Player(String name, String nation) {
		this.name = name;
		this.nation = nation;
	}
	
	public String toString() {
		return name+ ":" +nation;
	}
	
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		System.out.println("equals");
		return thisValue.contentEquals(compareValue);
	}
	
	public int hashCode() {
		return toString().hashCode();
	}
	
//	@Override
//	public int compareTo(SetPlayer o) {
//		return name.compareTo(o.name);
//	}
//	
	
}
