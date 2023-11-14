package abstractFactory;

import abstractFactory.Windows.WindowsButton;
import abstractFactory.Windows.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory{

	@Override
	public Button getButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new WindowsCheckBox();
	}
	
}
