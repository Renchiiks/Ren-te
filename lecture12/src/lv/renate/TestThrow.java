package lv.renate;

public class TestThrow {

	
	public static void main(String[] args) {
		CheckAge(10);
			
		
	}
	public static void CheckAge(int age){
		if (age< 18){
			throw new ArithmeticException("Access denied");
			
		}else{
			System.out.println("Access granted");
		}
	}

}
