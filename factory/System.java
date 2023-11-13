package factory;

public class System {
	
	private System()
	{
		/*
		  As we only need to get System
		 */
	}
	public static OperatingSystem getSystem(String version,String architecture,String type) throws Exception
	{
		switch(type)
		{
			case "Windows":
				return new WindowsOS(version,architecture);
			case "Mac":
				return new MacOS(version,architecture);
			default:
				throw new IllegalArgumentException("OS not supported");
		}
	}
}
