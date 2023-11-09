package singleton;

public class EagerSingleton {
	private static EagerSingleton instance=new EagerSingleton();
	
	private EagerSingleton()
	{
		
	}
	
	/*
	  This solves the problem of lazy singleton related to threads but there is an issue
	  Even though we are not using it , the JVM will still initialize it and this will be
	  waste of usage of memory
	 */
	@SuppressWarnings("unused")
	private static EagerSingleton getInstance()
	{
		return instance;
	}
}
