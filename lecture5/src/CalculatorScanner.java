import java.util.Scanner;


public class CalculatorScanner {

	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter  number one: ");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter number two: ");
		int num2 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Input operator /+-*% :");
		
		String add = scanner.nextLine();
		
		int result = 0;
		if(add.equals ("+")){
			result = num1 + num2;
		}else if(add.equals("-")){
			result = num1 - num2;
		}else if(add.equals("*")){
			result = num1 * num2;
		}else if(add.equals("/")){
			result = num1 / num2;
		}else if(add.equals("%")){
			result = num1 % num2;
		}else{
			System.out.println("Some thing is wrong");
		}
		System.out.println(num1+ add + num2+ " = " + result );

	}

}
