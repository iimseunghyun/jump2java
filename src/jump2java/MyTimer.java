package jump2java;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {

	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer(true);
		TimerTask task1 = new MyTimeTask();
		System.out.println("task1은 잠시 후에 실행됩니다.");
		t.schedule(task1, 1000);
		
		Thread.sleep(5000); //5초 동안 프로그램을 멈춘다.
		System.out.println("이제 모든 것을 종료합니다.");
	}
}
