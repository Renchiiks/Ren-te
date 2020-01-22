import java.util.Scanner;


public class ScannerInput {

	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter name:");
		String name = scanner.nextLine();
		
		System.out.println("Your number is:" +number);
		
		System.out.println("Your name is: "+name);
	

	}

}
