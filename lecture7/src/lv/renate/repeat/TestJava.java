package lv.renate.repeat;

import java.util.Scanner;

public class TestJava {

	
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input value ");
		
		int inputValue = 0;
		
		
		while(!(input.hasNextInt())){
			
			inputValue = input.nextInt();
			
		}
		System.out.println("Assign to variable with type integer");
		

	}

}
