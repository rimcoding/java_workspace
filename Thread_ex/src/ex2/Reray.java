package ex2;

public class Reray {

	int run = 0;

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public synchronized void runningman(int run) {
		int Reraymm = getRun();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setRun(Reraymm + run);
		System.out.println("선수가 총" + getRun() + "M만큼 이어 달렸습니다");
	}

}

class Runningman1 extends Thread {
	Reray reray;

	public Runningman1(Reray reray) {
		this.reray = reray;
	}

	@Override
	public void run() {
		reray.runningman(500);
	}
}

class Runningman2 extends Thread {
	Reray reray;

	public Runningman2(Reray reray) {
		this.reray = reray;
	}

	@Override
	public void run() {
		reray.runningman(300);
	}
}

class Runningman3 extends Thread {
	Reray reray;

	public Runningman3(Reray reray) {
		this.reray = reray;
	}

	@Override
	public void run() {
		reray.runningman(200);
	}
}

class Runningman4 extends Thread {
	Reray reray;

	public Runningman4(Reray reray) {
		this.reray = reray;
	}

	@Override
	public void run() {
		reray.runningman(800);
	}
}
