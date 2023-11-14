package abstractFactory;

public class Application {
	
	private Button button;
	
	private CheckBox checkBox;
	
	public Application(UIFactory ui)
	{
		button=ui.getButton();
		checkBox=ui.getCheckBox();
	}
	
	public void details()
	{
		button.paint();
		checkBox.selection();
	}
	
	public static void main(String[] args) {
		
		Application app=new Application(new WindowsUIFactory());
		app.details();
		
		Application app1=new Application(new MacUIFactory());
		app1.details();
	}
}
