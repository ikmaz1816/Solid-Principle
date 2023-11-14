package abstractFactory.Windows;

import abstractFactory.Button;

public class WindowsButton implements Button{

	@Override
	public void paint() {
		System.out.println("The color is Blue");
	}

}
