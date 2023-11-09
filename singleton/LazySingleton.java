package singleton;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LazySingleton implements Serializable{
	private static LazySingleton instance;
	
	private LazySingleton()
	{
		/*
		  As with singleton we only need one object hence we will be using a private
		  Constructor.
		  But to get the instance we need a method.
		  With singleton every time you call an object it returns the same object.
		 */
	}
	public static LazySingleton getInstance()
	{
		if(instance==null)
			instance=new LazySingleton();
		return instance;
	}
	/*
	  But if we use multi threading then it is an issue.
	  Because two threads can enter at the same point and create two instances 
	  We can also solve this problem using synchronized keyword and intializing the instance when 
	  declaring it
	 */
}
