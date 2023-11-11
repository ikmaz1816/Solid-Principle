package proxy;

public class ATM implements Account{

	@Override
	public void getAccountNumber() {
		Bank b=new Bank();
		b.getAccountNumber();
		//So we have used the actual object in a proxy object
	}
	
}
