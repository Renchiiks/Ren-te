
public class IfElseIf {

	
	public static void main(String[] args) {
		int time = 10;
		
		if(time<10){
			System.out.println("Good morning.");
		}else if(time < 18){
			System.out.println("Good day.");
		}else {
			System.out.println("Good evening");
			
		}
		int number = 1;
		int number2 = 5;
		
		if(number == 1){
			if (number2 < 10)
				System.out.println("Correct");
			if (number2 > 10)
				System.out.println("Value must be less then 10");
			
			System.out.println("ONE");
			
		}else if(number == 2){
			System.out.println("TWO");
			
		}else if(number == 9){
			System.out.println("NINE");
			
		}else{
			System.out.println("OTHER");
		}

	}

}