package lv.renate;

import lv.renate.graph.Point2D;
import lv.renate.graph.Point3D;
import lv.renate.graph.Point4D;

public class TestInheritance {

	
	public static void main(String[] args) {
		Point2D point = new Point2D();
		System.out.println(point.toString());
		Point2D pointXY= new Point2D(10,-2);
		System.out.println(pointXY.toString());
		
		pointXY.setX(8);
		pointXY.setY(-6);
		System.out.println(pointXY);
		
		System.out.println("x is: "+pointXY.getX());
		
		Point3D pointXYZ = new Point3D(1,2,3);
		System.out.println(pointXYZ);
		
		pointXYZ.setY(-99);
		System.out.println(pointXYZ);
		
		Point4D pointXYZT = new Point4D(3,4,5,6);
		System.out.println(pointXYZT);
		
		System.out.println(pointXYZT.getX());
		

	}

}
