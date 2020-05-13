package jump2java;

import java.util.ArrayList;

public class SampleObjTest {

	public static void main(String[] args) {
		SampleObj obj1 = new SampleObj("객체1");
		SampleObj obj2 = new SampleObj("객체2");
		SampleObj obj3 = new SampleObj("객체3");
	
		ArrayList<SampleObj> list = new ArrayList<SampleObj>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
	
		System.out.println(list);
		
		SampleObj target = new SampleObj("객체3");
		int index = list.indexOf(target);
		System.out.println("list의 객체3의 인덱스는 "+index);
		System.out.println("list의 객체3의 해시코드 "+list.get(index).hashCode());
		System.out.println("\"객체3\"으로 선언된 target의 해시코드 "+target.hashCode());
	}

}
