package lv.renate.learnjavaclass;

public class TestJavaProgram {

	public static void main(String[] args) {
		Box boxObject = new Box();

		double volume;

		boxObject.width = 20.34;
		boxObject.height = 3.67;
		boxObject.depth = 23.6;
		
		double result = boxObject.getvolume();

		System.out.println("Volume from method: " + result);

		/*volume = boxObject.width * boxObject.height * boxObject.depth;

		System.out.println("Volume: " + volume);

		Box boxObject2 = new Box();

		System.out.println(boxObject2.width);*/

	}

}
