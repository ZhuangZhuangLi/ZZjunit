package thread;

public class Join implements Runnable {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			if (i == 5) {
				Join j = new Join();
				Thread t = new Thread(j);
				t.setName("��������ִ�е��߳�.");
				t.start();
				try {
					// ��������̣߳���ִ��
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("û��������̡߳�" + (i + 1));
		}
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + (i + 1));
		}
	}
}