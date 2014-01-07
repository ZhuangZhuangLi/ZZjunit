package view;

public class AddThread implements Runnable {
	BankOrder b=null;
	int level=0;
	int customerId=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		b.add(b.queen, level, customerId);
	}
	public AddThread(BankOrder b,int level,int customerId) {
		// TODO Auto-generated constructor stub
		this.b=b;
		this.customerId=customerId;
		this.level=level;
	}
}
