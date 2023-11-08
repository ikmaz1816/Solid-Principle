package dependencyInversion;

public class Calculator {
	/*
	  Whenever we write code it is necessary to write the code in such a way that there is no need
	  to manipulate the code again to meet business requirement
	  We can create a simple calculator with the help of switch case but then every time there is
	  a need to add a function then we have to make changes to our code
	  This makes the code tightly coupled
	  So we will be creating an application where whenever there is a need to call a functionality
	  it can be done independently by a particular class
	 */
	public void perform(int a,int b,Operation o)
	{
		System.out.println(o.operate(a, b));
	}
	public static void main(String[] args) 
	{
		//We achieved this with the help of interface 
		//Now we can pass object of implementation class 
		Calculator c=new Calculator();
		//for addition
		c.perform(5, 3, new AddCalculator());
		//for subtraction
		c.perform(5, 3, new SubCalculator());
		// we  can also extend the functionality
		//This is open close principle
	}
}
