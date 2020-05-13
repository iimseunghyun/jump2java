package settreeset;

import java.util.TreeSet;

public class PlayerTest2 {

	public static void main(String[] args) {
		TreeSet<Player> ts = new TreeSet<Player>(new PlayerComparator());
		Player p1 = new Player("박지성", "한국");
		Player p2 = new Player("지단", "프랑스");
		ts.add(p1);
		ts.add(p2);
		System.out.println(ts);
	}

}
