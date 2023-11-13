package factory;

public class MacOS extends OperatingSystem{

	public MacOS(String version,String architecture)
	{
		super.setVersion(version);
		super.setArchitecture(architecture);
	}
	@Override
	public void changeDir(String command) {
		// Mac command to change Directory
		
	}

	@Override
	public void removeDir(String command) {
		// Mac command to remove directory
		
	}

}	
