package comparator;

public class PlayerVO implements Comparable<PlayerVO> {
	private String name;
	private String position;
	private int regYear;
	public PlayerVO(String name, String position, int regYear) {
		super();
		this.name = name;
		this.position = position;
		this.regYear = regYear;
	}
	@Override
	public String toString() {
		return name + ":" + position + ":" + regYear;
	}
	
	@Override
	public int compareTo(PlayerVO o) {
		System.out.println("정렬시도");
		return this.name.compareTo(o.name);
	}
	
	public int getRegYear(){
		return regYear;
	}
	
	public String getPosition() {
		return position;
	}
	public static void main(String[] args) {

	}

}
