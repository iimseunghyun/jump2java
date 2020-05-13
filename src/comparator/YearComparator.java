package comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<PlayerVO>{
	
	@Override
	public int compare(PlayerVO o1, PlayerVO o2) {
		return o1.getRegYear() - o2.getRegYear(); 		//년도가 앞서면 음수가 나오게 한다.
	}
}
