package lv.renate;

public class TestExeptionHandling {

	
	public static void main(String[] args) {
		try{
			int number1 = 0;
			int number2 = 10;
			
			int result = number2 / number1;
			
			System.out.println(result);
			
		}catch (Exception e){
			System.out.println("Check code in try block" +e);
		}
		try{
			int[] myNumbers = {1,2,3,4,5};
			System.out.println(myNumbers[2]);
		}catch(Exception e2 ){
			System.out.println("Error in array");
			
		}finally{
			System.out.println("The try catch block is finished.");
		}
		
		
		
		
		


	}

}
