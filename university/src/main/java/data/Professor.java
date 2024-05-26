package data;

import java.util.HashSet;

public class Professor extends Person {
    private HashSet<String> courses;

    public Professor(String dept, double age, String name) {
        super(dept, age, name);
        this.courses = new HashSet<String>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

   public void deleteCourse(String course) {
	   courses.remove(course);
   }
   
   public void displayCourses() {
	   System.out.println("Courses:"+getCourses());
   }

private HashSet<String> getCourses() {
	// TODO Auto-generated method stub
	return courses;
}

}
