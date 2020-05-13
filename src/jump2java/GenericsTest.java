package jump2java;

import java.util.ArrayList;

public class GenericsTest {

	public static void main(String[] args) {
		//제네릭을 사용하지 않는 경우
		ArrayList aList = new ArrayList();
		aList.add("hello");
		aList.add("java");
		
		//String hello = aList.get(0); 에러
		String hello = (String) aList.get(0);
		String java = (String) aList.get(1);
				
		//제네릭을 사용하는 경우
		ArrayList<String> aList2 = new ArrayList();
		aList2.add("hello");
		aList2.add("java");
		
		String hello2 = aList2.get(0);
		String java2  = aList2.get(1);
	}

}
