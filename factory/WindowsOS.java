package factory;

public class WindowsOS extends OperatingSystem{
	
	public WindowsOS(String version,String architecture)
	{
		super.setVersion(version);
		super.setArchitecture(architecture);
	}

	@Override
	public void changeDir(String command) {
		//Windows command to change directory
		
	}

	@Override
	public void removeDir(String command) {
		//Windows command to remove directory
		
	}
}
