package Basic;

public class Student {
	
	private String name = "Mani";
	private int age;
	private String surname = "Sapra";
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		surname = "Agarwal";
	}
	
	public Student(String name, int age, String surname) {
		this.name = name;
		this.age = age;
		this.surname = surname;
	}
	
	public void setName(String name) {
		this.name = name;
	
	}
	
	public String getName() {
		
		return name;
		
		
	}
	public void setAge(int age) {
		this.age = age;
	
	}
	
	public int getAge() {
		
		return age;
		
		
	}
	public void setSurname(String surname) {
		this.surname = surname;
	
	}
	
	public String getSurname() {
		
		return surname;
		
		
	}
	

}
