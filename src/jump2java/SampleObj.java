package jump2java;

public class SampleObj {
	private String name;
	
	public SampleObj(String name) {	//생성자 함수. !리턴값타입 없음!
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object obj) {
		String currentObj = this.toString();
		String otherObj = obj.toString();	
		return currentObj.contentEquals(otherObj);
	}
	public static void main(String[] args) {
		
	}

}
