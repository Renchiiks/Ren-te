public class ArraysAndLoop {

	public static void main(String[] args) {
		// Dec4are variable
		int[] marks = { 23, 56, 6, 45, 67, 20, 34 };
		// Make to String all elements of array
		// Print in console
		System.out.println("[ " + marks[0] + ", " + marks[1] + " ]");

		for (int i = 0; i < marks.length; i++) {

			System.out.println(marks[i]);

		}
		System.out.print("[");
		for (int i = 0; i < marks.length -1; i++) {

			System.out.print(marks[i] + ",");

		}
		System.out.println(marks[6] +"]");//ja ir zināms skaits
		System.out.println(marks[marks.length-1]+ "]");//ja nav zinams skaits un var mainīties

	}

}
