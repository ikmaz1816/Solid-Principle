package chainOfResponsibilty;

public class UPI extends Payment{

	@Override
	public void doPayment(int amount) {
		if(amount>=50000)
		{
			next.doPayment(amount);
		}
		else
		{
			System.out.println("UPI did the payment of less than 50000");
		}
	}

	
	
}
