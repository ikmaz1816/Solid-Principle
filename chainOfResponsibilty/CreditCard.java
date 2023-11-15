package chainOfResponsibilty;

public class CreditCard extends Payment{

	@Override
	public void doPayment(int amount) {
		System.out.println("Credit card did the payment of more than 50000");
	}
	
}
