package chainOfResponsibilty;

public abstract class Payment {
	
	public Payment next;
	public void setNext(Payment p)
	{
		this.next=p;
	}
	public abstract void doPayment(int amount);
}
