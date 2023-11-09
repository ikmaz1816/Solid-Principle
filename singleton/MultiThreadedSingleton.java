package singleton;

public class MultiThreadedSingleton {
  private static MultiThreadedSingleton instance;
  
  private MultiThreadedSingleton()
  {
	  
  }
  /*
     now in this we will using a synchronize block
     that will take care of threads
   */
  
  public static MultiThreadedSingleton getInstance()
  {
	  if(instance==null)
	  {
		  //this would be start of synchronize block
		  //As we are not making whole block as synchronize
		  synchronized(MultiThreadedSingleton.class)
		  {
			  //We are checking instance again as threads would enter one by one 
			  //in the above case at line 17 it was asynchronous hence all threads can access it
			  //Here threads would be allowed to access sequentially
			  if(instance==null)
			  {
				  instance=new MultiThreadedSingleton();
			  }
		  }
	  }
	  //for static method there is class level locking
	  return instance;
  }
}
