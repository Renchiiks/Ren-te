package lv.renate.reapeatarray;

import java.util.Scanner;

public class ScannerAndArray {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		System.out.println("Input first value");
		arr[0] = sc.nextInt();
		System.out.println("Input first value");
		arr[1] = sc.nextInt();
		
		
		
		System.out.println(arr[0]+ " "+arr[1]);

	}

}
