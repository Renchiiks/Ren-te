package lv.renate;

import lv.renate.figure.Rectangle;

public class TestFigure {

	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toSting());
		
		Rectangle rectangle2 = new Rectangle(2.5f,5.5f);
		System.out.println(rectangle2.toSting());
		
		Rectangle rectangle3 = new Rectangle(2.5f);
		System.out.println(rectangle3.toSting());

	}

}
