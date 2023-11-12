package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception{
		List<Student> ls=new ArrayList<>();
		ls.add(new Student("Imran","1151"));
		ls.add(new Student("Ayaan","1009"));
		
		StudentIterator si=new StudentIterator(ls);
		while(si.hasNext())
		{
			System.out.println(si.next().toString());
		}
	}
}
