package settreeset;

import java.util.HashSet;

public class PlayerTest {

	public static void main(String[] args) {
		HashSet<Player> player = new HashSet<Player>();
		player.add(new Player("박지성","한국"));
		player.add(new Player("지단","프랑스"));
		System.out.println(player);
		Player p = new Player("지단","프랑스");
		player.remove(p);
		System.out.println(player);
		
	}

}
