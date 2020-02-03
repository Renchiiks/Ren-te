package lv.renate;

import java.util.Scanner;

public class TestScannerInputArray {

	public static void main(String[] args) {

		String[] stringArr = new String[3];
		Scanner sc = new Scanner(System.in);
		System.out.println(stringArr.length + " users in array: ");
		for (int i = 0; i < stringArr.length; ++i) {
			stringArr[i] = sc.nextLine();
		}

		System.out.println("Do you want to print array?");
		System.out.println("Type (Print)");
		System.out.println("Type (notPrint)");

		String statusCheck = sc.nextLine();

		if (statusCheck.equals("Print")) {
			printArray(stringArr);
		} else if (statusCheck.equals("notPrint")) {
			System.out.println("Exit");
		} else {
			System.out.println("Wrong values");
		}
	}

	public static void printArray(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " this user is added to array");

		}

	}
}
