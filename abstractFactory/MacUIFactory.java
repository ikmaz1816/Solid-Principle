package abstractFactory;

import abstractFactory.Mac.MacButton;
import abstractFactory.Mac.MacCheckbox;

public class MacUIFactory implements UIFactory{

	@Override
	public Button getButton() {
		return new MacButton();
	}

	@Override
	public CheckBox getCheckBox() {
		return new MacCheckbox();
	}

}
