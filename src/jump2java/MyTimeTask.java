package jump2java;

import java.util.TimerTask;;

public class MyTimeTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("이것은 제가 원하는 작업입니다.");
	}

}
