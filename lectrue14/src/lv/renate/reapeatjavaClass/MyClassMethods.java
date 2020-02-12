package lv.renate.reapeatjavaClass;

public class MyClassMethods {
	public static void myMethod() {
		System.out.println("Hello world!");

	}

	public String myStringMethod() {
		myMethod();

		return "zip, zip";
	}

	public double returnDouble() {
		return 56.8;
	}

	public char returnChar(int a, int b) {
		int charFromInt = a + b;
		char charVariable = (char) charFromInt;


		return charVariable;
	}
}
