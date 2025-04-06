package Basic;
import study.College;

public class HelloWorld {
	
	public static void main (String[] args) {
		
		
		Student st = new Student("Manisha", 30);
		Student st1 = new Student("Shivam", 29);
		Student st3 = new Student("Shivam", 29, "Bansal");
		
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getSurname());
		
		System.out.println(st1.getName());
		System.out.println(st1.getAge());
		System.out.println(st1.getSurname());
		
		System.out.println(st3.getName());
		System.out.println(st3.getAge());
		System.out.println(st3.getSurname());
		
		College cl = new College();
		cl.setName("MPS");
		System.out.println(cl.getName());
		
		
		
		
		
		
	}
		
}

