package lv.renate;

import java.util.ArrayList;

public class TestArrayList {

	
	public static void main(String[] args) {
		String[] arr = new String[2];
		System.out.println(arr.length);
		arr[0] = "Element Name";
		System.out.println(arr[0]);
		
		ArrayList<String> array = new ArrayList<>();
		
		array.add("First to array");
		array.add("Second to array");
		array.add("Third to array");
		array.add("3");
		System.out.println(array);
		System.out.println(array.size());

	}
	

}
