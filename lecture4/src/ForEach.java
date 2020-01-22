
public class ForEach {

	
	public static void main(String[] args) {
		int[] marks = { 23, 56, 6, 45, 67, 20, 34, 65 };
		//For each loops for ()type var : arrays)
		for(int mark : marks){
			System.out.println(mark);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		for (int i = 0; i < marks.length; i++){
			System.out.println(marks[i]);
		}
	

	}

}
