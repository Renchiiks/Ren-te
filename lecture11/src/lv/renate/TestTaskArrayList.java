package lv.renate;

import java.util.ArrayList;

public class TestTaskArrayList {

	
	public static void main(String[] args) {
		ArrayList<String>cars = new ArrayList<>();
		
		cars.add("Mazda");
		cars.add("BMW");
		cars.add("Opel");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("BMW");
		cars.add("Opel");
		cars.add("Ford");
		cars.add("Opel");
		cars.add("Ford");
		
		for(String car: cars){
			System.out.print(car+ " ");
		}
		
		System.out.println(cars.size());

	}

}