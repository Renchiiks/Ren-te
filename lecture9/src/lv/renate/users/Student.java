package lv.renate.users;

public class Student extends Person{
	private int numCourse;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 12;
	
	public Student(String name, String adress){
		super(name, adress);
		this.numCourse = 0;
		this.courses = new String[MAX_COURSES];
		this.grades = new int[MAX_COURSES];
	}
	public void addCourseGrade(String course, int grade){
		courses[numCourse]= course;
		grades[numCourse]=grade;
		++numCourse;
	}
	public void printGrades(){
		
	}
	public double getAverageGrade(){
		
		return 0.0;
	}
	public String addCourse(){
		return "Teacher: "+ super.toString();
	}
}