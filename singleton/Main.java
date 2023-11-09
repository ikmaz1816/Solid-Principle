package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//serialization();
		
		//Another thing that can break singleton is reflection
		//With reflection we can get constructor and make it public
		//And get the instance
		
		reflection();
	}

	private static void reflection() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor[] c=LazySingleton.class.getDeclaredConstructors();
		//As there is only one declared constructor
		Constructor constructor=c[0];
		constructor.setAccessible(true);
		LazySingleton instance1=(LazySingleton)constructor.newInstance();
		LazySingleton instance2=LazySingleton.getInstance();
		System.out.println(instance1.hashCode()+" "+instance2.hashCode());
		//The values will be different
		//Hence reflection and serialization breaks the singleton pattern
		
		//Not to solve this problem we will use ENUMS
		//Enums values are bydefault static 
		System.out.println(EnumSingleton.INSTANCE.hashCode());
		System.out.println(EnumSingleton.INSTANCE.hashCode());
		// Same value
		//We can replace class with enum and implement singleton pattern
		//Hence problem of reflection is also solved
	}

	private static void serialization() throws IOException,ClassNotFoundException{
		//Serialization is implementated in Lazy Singleton
		//It is a marker interface which is used to send data across networks
		//It converts the data to byteStream before sending it over the network
		// and vice verse when it receives data from network
		LazySingleton instance=LazySingleton.getInstance();
		ObjectOutputStream object=new ObjectOutputStream(new FileOutputStream("Object.obj"));//this is the file name where we write the content it is also used for retrievel
		object.writeObject(instance);
		object.close();
		ObjectInputStream object1=new ObjectInputStream(new FileInputStream("Object.obj"));//the data is retrieved because of this file
		LazySingleton instance1=(LazySingleton)object1.readObject();
		object1.close();
		System.out.println(instance.hashCode() + " "+ instance1.hashCode());
		//the hashcode would be different
		//So serialization breaks the concept of singleton pattern
		// while deserializing it calls the object 
		//Hence we have to use the readResolve method which is called during deserialization
		//Doing the same thing with only another class having the same content of lazysingleton
		// and readResolve method
		SerializableSingleton instance2=SerializableSingleton.getInstance();
		ObjectOutputStream object2=new ObjectOutputStream(new FileOutputStream("Object1.obj"));//this is the file name where we write the content it is also used for retrievel
		object2.writeObject(instance2);
		object2.close();
		ObjectInputStream object3=new ObjectInputStream(new FileInputStream("Object1.obj"));//the data is retrieved because of this file
		SerializableSingleton instance3=(SerializableSingleton)object3.readObject();
		object3.close();
		System.out.println(instance2.hashCode() + " "+ instance3.hashCode());
		
		
		
	}
}
