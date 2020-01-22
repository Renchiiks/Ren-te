public class TestElseAndBlocks {

	public static void main(String[] args) {

		System.out.println("****************");
		System.out.println("****************");

		boolean test = true;
		int result;

		if (test) {
			int number = 100;
			System.out.println("True");
			System.out.println(number);
			result = number + number;
			System.out.println("Result value is "+result);
		} else {
			System.out.println("False");
		}

		System.out.println("After if else block");

		boolean test2 = true;

		if (test2) {
			System.out.println("True");
			int number = 5;
			result = number + number;
			System.out.println("Result value is "+result);
		} else {
			System.out.println("False");
		}

		System.out.println("After if else block");
	}

}
