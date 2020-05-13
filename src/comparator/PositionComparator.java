package comparator;

import java.util.Comparator;

public class PositionComparator	implements Comparator<PlayerVO> {
		public int compare(PlayerVO o1, PlayerVO o2) {
			return o1.getPosition().compareTo(o2.getPosition());
		}
	public static void main(String[] args) {		
	}

}
