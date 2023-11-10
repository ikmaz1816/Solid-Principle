package builder;

public class Student {
	
	private int sid;
	
	private String name;
	
	private String address;

	private Student(StudentBuilder sb)
	{
		//We can do the validation here as we get the StudentBuilder here
		sid=sb.sid;
		name=sb.name;
		address=sb.address;
	}
	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public static class StudentBuilder
	{
		private int sid;
		
		private String name;
		
		private String address;
		
		public StudentBuilder setSid(int id)
		{
			this.sid=id;
			return this;
		}
		public StudentBuilder setName(String name)
		{
			this.name=name;
			return this;
		}
		public StudentBuilder setAddress(String address)
		{
			this.address=address;
			return this;
		}
		
		public Student build()
		{
			return new Student(this);
		}
	}
	
}
