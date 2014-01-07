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
			System.out.println("��һ���̵߳�" + (i + 1) + "������.");
			// �õ�ǰ�߳���ͣ
			yield();
		}
	}
}

class YieldSecond extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�ڶ����̵߳�" + (i + 1) + "������.");
			// �õ�ǰ�߳���ͣ
			yield();
		}
	}
}

class YieldThird extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�������̵߳�" + (i + 1) + "������.");
			// �õ�ǰ�߳���ͣ
			yield();
		}
	}
}
