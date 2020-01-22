public class Calculator {

	public static void main(String[] args) {

		char operatorMath = '+';
		double num1 = 4;
		double num2 = 5.5;
		double result;

		if (operatorMath == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (operatorMath == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(result);
		} else if (operatorMath == '%') {
			if (num1 >= num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out.println("Wrong data");
			}

		} else {
			System.out.println("Wrong data");
		}

		System.out.println("-------------------------------------");

		char operatorMath2 = 'l';
		double result2;

		switch (operatorMath2) {
		case '+':
			result2 = num1 + num2;
			System.out.println(result2);
			break;
		case '-':
			result2 = num1 - num2;
			System.out.println(result2);
			break;
		case '*':
			result2 = num1 * num2;
			System.out.println(result2);
			break;
		case '/':
			result2 = num1 / num2;
			System.out.println(result2);
			break;
		case '%':

			if (num1 <= num2) {
				System.out.println("If Num1 is less then result is num1:"
						+ num1);
			} else {
				result2 = num1 % num2;
				System.out.println(result2);

			}
			break;
		default:
			System.out.println("Wrong values!");

		}

	}

}
