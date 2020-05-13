package jump2java;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorEx1 {
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<10; i++) {
			set.add("ABC"+i);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
