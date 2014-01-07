package thread;

public class Yield {
	public static void main(String[] args) {
		YieldFirst yf = new YieldFirst();
		YieldSecond ys = new YieldSecond();
		YieldThird yt = new YieldThird();
		yf.start();
		ys.start();
		yt.start();
	}
}

class YieldFirst extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("第一个线程第" + (i + 1) + "次运行.");
			// 让当前线程暂停
			yield();
		}
	}
}

class YieldSecond extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("第二个线程第" + (i + 1) + "次运行.");
			// 让当前线程暂停
			yield();
		}
	}
}

class YieldThird extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("第三个线程第" + (i + 1) + "次运行.");
			// 让当前线程暂停
			yield();
		}
	}
}
