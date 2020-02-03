package lv.renate.users;

public class Student extends Person{
	private int numCourse;
	private String[] courses;
	private int[] grades;
	private static final int MAX_COURSES = 12;
	
	
	public Student(String studentName, String StudentAdress){
		super(studentName, StudentAdress);
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
		System.out.println();
		for(int i = 0; i<numCourse; i++) {
			System.out.println(" "+ courses[i]+ ": "+ grades[i]);
		}
		System.out.println();
	}
	public double getAverageGrade(){
		int sum = 0;
		for(int i = 0; i<numCourse; i++) {
			sum += numCourse;
		}
		return (double)sum/numCourse;
	}
	public String toString (){
		return "Student: "+ super.toString();
	}
}
