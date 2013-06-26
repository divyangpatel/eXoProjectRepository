package com.shapecolor.main;

import com.shape.Shape;
import com.shape.Square;
import com.shape.Rectangle;
import com.shape.Circle;
import com.color.BlueColor;
import com.color.RedColor;
import com.color.GreenColor;
/**
 * 
 * @author divyang
 * 
 */
public class ShapeColorBridgePatternMain {
	/**
	 * This is
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("===============================================");
		System.out.println("Different Shape With Filled Color");
		System.out.println("===============================================");
		Shape rectangleShape = new Rectangle(new RedColor());
		rectangleShape.colorIt();
		System.out.println("-----------------------------");
		Shape circleShape = new Circle(new GreenColor());
		circleShape.colorIt();
		System.out.println("-----------------------------");
		Shape squareShape = new Square(new BlueColor());
		squareShape.colorIt();
		System.out.println("===============================================");
		System.out.println("Set New Color for Each Shape");
		System.out.println("===============================================");
		rectangleShape.setColor(new BlueColor());
		rectangleShape.colorIt();
		System.out.println("-----------------------------");
		circleShape.setColor(new RedColor());
		circleShape.colorIt();
		System.out.println("-----------------------------");
		squareShape.setColor(new GreenColor());
		squareShape.colorIt();

	}

}
