package lv.renate.users;

import java.util.Arrays;

public class Teacher extends Person {
	private int numCourses;
	private String[] courses;
	private static final int MAX_COURSES = 4;

	public Teacher(String name, String adress) {
		super(name, adress);
		this.numCourses = 0;
		this.courses = new String[MAX_COURSES];
	}

	public void addCourse(String course) {
		courses[numCourses] = course;
		++numCourses;
		System.out.println(Arrays.toString(this.courses));

	}
	
	public boolean addCourses(String course){
		return true;
	}
	public boolean removeCourses(String course){
		return true;
	}
	
	public String addCourse(){
		return "Teacher: "+ super.toString();
	}
}
