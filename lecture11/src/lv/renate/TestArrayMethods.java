package lv.renate;

import java.util.ArrayList;

public class TestArrayMethods {

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
		
		
		System.out.println(cars.indexOf("Mazda"));
		System.out.println(cars.isEmpty());
		System.out.println(cars.get(6));
		System.out.println(cars.set(0, "Tesla"));
		
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		
		for(String car: cars){
			System.out.print(car+ " ");
		}
		System.out.println(cars.size());
		
		System.out.println();
		
		cars.remove("Ford");
		cars.remove("Fore");
		
		for(String car: cars){
			System.out.print(car+ " ");
		}
		System.out.println(cars.size());
		
		

	}

}
