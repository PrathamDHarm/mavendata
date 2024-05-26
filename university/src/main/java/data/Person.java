package data;

public class Person {
	private String dept;
	private double age;
	private String name;
	
	public Person(String dept, double age, String name) {
		
		this.dept = dept;
		this.age = age;
		this.name = name;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+getName());
		System.out.println("Age: "+getAge());
		System.out.println("Department: "+getDept());
	
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		if(age>0) {
			this.age = age;
		}else {
			throw new IllegalArgumentException("Provide Positive Age");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}