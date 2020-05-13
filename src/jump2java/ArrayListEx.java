package jump2java;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(0, "z");
		list.add(1, "y");	//이와 같은 빈번한 수정이 있는 경우 LinkedList가 유리하다.
		System.out.println(list.get(1)); // sysout Ctrl+Space
		System.out.println(list.size());
		System.out.println(list.contains("z"));
		System.out.println(list.remove("y"));
		System.out.println(list.remove(0));
		System.out.println(list);
	}

}
