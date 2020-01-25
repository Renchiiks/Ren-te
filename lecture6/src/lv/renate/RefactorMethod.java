package lv.renate;

public class RefactorMethod {

	public static void main(String[] args) {

		System.out.println(getGreeting(15));
		getGreetingWithVoid(3);

	}

	public static String getGreeting(int time) {
		if (time < 10) {
			return "Good morning.";
		} else if (time < 18) {
			return "Good day.";
		} else {
			return "Good evening";

		}

	}

	public static void getGreetingWithVoid(int time) {
		if (time < 10) {
			System.out.println("Good morning.");
		} else if (time < 18) {
			System.out.println("Good day.");
		} else {
			System.out.println("Good evening");

		}
	}

}