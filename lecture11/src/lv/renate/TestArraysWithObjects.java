package lv.renate;

import java.util.ArrayList;
import java.util.Collections;

public class TestArraysWithObjects {

	public static void main(String[] args) {

		Integer intObj = 40;
		Double doubleObj = 40.32;

		System.out.println(intObj);

		ArrayList<Integer> intArray = new ArrayList<>();
		
		intArray.add(23);
		intArray.add(44);
		intArray.add(2);
		intArray.add(56);
		
		System.out.println(intArray);
		Collections.sort(intArray);
		System.out.println(intArray);
	}

}
