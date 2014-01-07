package view;

public class CallThread implements Runnable {
	BankOrder b=null;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.call(b.queen);
	}
	public CallThread(BankOrder b) {
		// TODO Auto-generated constructor stub
		this.b=b;
	}
}
