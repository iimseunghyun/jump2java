package examples_object;

public class UsingObject {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode()); //해당 객체만의 고유한 10진수
		System.out.println(Integer.toHexString(obj1.hashCode())); // 16진수
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1); //.toString() 자동랩핑
		System.out.println(obj1.toString()); // 객체의 정보 출력 @16진수 동일
		
		System.out.println(obj1.getClass().getName());
		String str = obj1.getClass().getName()+"@"+Integer.toHexString(obj1.hashCode());
	}

}
