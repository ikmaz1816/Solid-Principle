package iterator;

import java.util.List;

public class StudentIterator {
	private List<Student> s;
	int length;
	public StudentIterator(List<Student> s)
	{
		this.s=s;
		length=s.size();
	}
	
	int index=0;
	
	
	public boolean hasNext()
	{
		return !(index==length);
	}
	public Student next() throws Exception
	{
		if(index>=length)
			throw new Exception("You have accessed all the Students");
		return s.get(index++);
	}
}
