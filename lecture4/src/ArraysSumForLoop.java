
public class ArraysSumForLoop {

	
	public static void main(String[] args) {
		int[] marks = { 23, 56, 6, 45, 67, 20, 34, 65 };
		
		//sum all values of arrays
		//print to console
		//int result = 10;
		//int testInt = 90;
		
		//result = testInt;
		
		//System.out.println("result value:" + result);
		
		int sum = 0;
		
		for (int i = 0; i < marks.length; i++){
			sum += marks[i];
		}
		System.out.println(("sum of marks: "+sum));
		
		//System.out.println(marks[0]+marks[1]);
		int sumTest = 0;
		sumTest = sumTest + 200;
		sumTest = sumTest + 220;
		sumTest = sumTest + 240;
		
		System.out.println("Testing += operator: "+sumTest);
		
		int multTest = 1;
		multTest *= 20;
		multTest *= 2;
		multTest *= 1;
		
		System.out.println("Testing *= operator: "+multTest);
		
		int subTest = 1000;
		subTest -= 200;
		subTest -= 220;
		subTest -= 240;
		
		System.out.println("Testing -= operator: "+subTest);
		
		int devTest = 1000;
		devTest /= 20;
		devTest /= 5;
		devTest /= 1;
		
		System.out.println("Testing /= operator: " +devTest);
		
		

	}

}