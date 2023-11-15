package chainOfResponsibilty;

public class Main {
	public static void main(String[] args) {
		Payment p=new CreditCard();
		Payment p1=new UPI();
		p1.setNext(p);
		
		p1.doPayment(60000);
		/*
		  p1 itself called p and this is called as chain of responsibility
		 */
	}
}
