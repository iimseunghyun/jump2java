package settreeset;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{
	@Override
	public int compare(Player p1, Player p2) {
		String p1str = p1.toString();
		String p2str = p2.toString();
		
		return p1str.compareTo(p2str);
	}
}
