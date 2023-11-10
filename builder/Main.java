package builder;

public class Main {

	public static void main(String[] args) {
		Student s=new Student.StudentBuilder().setName("Imran").setSid(1).setAddress("115123").build();
		
		System.out.println(s.getAddress() +" "+s.getName()+" "+s.getSid());

	}

}
