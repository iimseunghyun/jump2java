package examples;

public class StringBufferTest {
	private static String x; //static이 붙으면 클래스변수. 객체가 생성된 클래스의 global변수
	
	public static void main(String[] args) {
		//생성
		StringBuffer sb1 = new StringBuffer();
		sb1.append("안녕하세요.")
		.append("또 만나요.")
		.append("모두들 사랑해요.");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//수정
		sb1.replace(0, 2, "잘가");
		System.out.println(sb1.toString()+sb1.hashCode());
		
		//reverse
		sb1.reverse();
		System.out.println(sb1.toString()+sb1.hashCode());
		sb1.reverse();

		//delete
		sb1.delete(10, 15);
		System.out.println(sb1.toString()+sb1.hashCode());
		
//		//static
//		replaces(sb1);
//		System.out.println(sb1.toString()+sb1.hashCode());

	}
//	public static void replaces(StringBuffer sb) {
//		return 미완
//	}
	
}
