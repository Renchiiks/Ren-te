package lv.renate;

import lv.renate.geometrcfigures.Circle;

public class TestFigureClass2 {

	
	public static void main(String[] args) {
		//Circle figure = new Circle();
		Circle figure2 = new Circle(40.2);
		Circle figure3 = new Circle(49.5, "green");
		
		
		//System.out.println(figure.getColor()+" "+figure.getRadius());
		System.out.println(figure2.getColor()+" "+figure2.getRadius());
		System.out.println(figure3.getColor()+" "+figure3.getRadius());
		
		System.out.println("Radius of figure " +figure2.getArea());
		System.out.println(figure3.toString());
		
		
		System.out.println(figure2.toString()+" and area is "+figure2.getArea());

	}

}
