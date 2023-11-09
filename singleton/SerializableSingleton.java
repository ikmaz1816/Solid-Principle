package singleton;

import java.io.Serializable;

public class SerializableSingleton implements  Serializable{
private static SerializableSingleton instance;
	
	private SerializableSingleton()
	{
		/*
		  As with singleton we only need one object hence we will be using a private
		  Constructor.
		  But to get the instance we need a method.
		  With singleton every time you call an object it returns the same object.
		 */
	}
	
	public static SerializableSingleton getInstance()
	{
		if(instance==null)
			instance=new SerializableSingleton();
		return instance;
	}
	/*
	  But if we use multi threading then it is an issue.
	  Because two threads can enter at the same point and create two instances 
	  We can also solve this problem using synchronized keyword and intializing the instance when 
	  declaring it
	 */
	/*
	  this method is itself called by JVM when the deserialization takes place
	 */
	public Object readResolve()
	{
		return instance;
	}
}
