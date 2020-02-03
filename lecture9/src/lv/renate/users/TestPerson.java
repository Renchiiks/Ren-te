package lv.renate.users;

public class TestPerson {

	public static void main(String[] args) {

		String[] strArr = new String[12];
		strArr[0] = "Sport";
		strArr[1] = "Math";

		System.out.println(strArr[0] + ", " + strArr[1]);

		Teacher teacher1 = new Teacher("Toms", "Riga");
		Person teacher2 = new Person("Mairis", "Riga");
		System.out.println(teacher1.toString());
		System.out.println(teacher2.toString());

//		teacher1.addCourse("Sport");
//		teacher1.addCourse("Math");
//		teacher1.addCourse("Biology");
//		teacher1.addCourse("History");

		String[] kursi = { "Sport", "Math", "Biology", "History" };

		for (String kurss : kursi) {
			teacher1.addCourse(kurss);
		}

		Teacher teacher3 = new Teacher("Raimons", "Ludza");
		System.out.println(teacher3.toString());
		String[] coursesForTeacher3 = { "Sport", "Art", "Biology", "History" };
		for (String kurss2 : coursesForTeacher3) {
			if (teacher3.addCourses(kurss2)) {
				System.out.println(kurss2 + " added ");

			} else {
				System.out.println(kurss2 + " cannot be added");
			}
		}
		for (String kurss2 : coursesForTeacher3) {
			if (teacher3.removeCourses(kurss2)) {
				System.out.println(kurss2 + " removed ");
			} else {
				System.out.println(kurss2 + " cannot be removed");
			}
		}

	}

}
