public class ArrayTask {

	public static void main(String[] args) {
		int[] taskArray = { 1, 4, 2, 3 };
		// find in array number 15
		// Print his name
		int number = 2;
		int findNumber = 0;

		for (int i = 0; i < taskArray.length; i++) {
			if (taskArray[i] == number) {
				findNumber = taskArray[i];
			}
			}
		if(findNumber == 1){
			System.out.println("ONE");
		}else if(findNumber == 2){
			System.out.println("ONE");
		}else if(findNumber == 3){
			System.out.println("ONE");
		}else if(findNumber == 4){
			System.out.println("ONE");
		}else{
			System.out.println("Not found");
		}	
		
	}
		
	}

