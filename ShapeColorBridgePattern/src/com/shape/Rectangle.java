package com.shape;

import com.color.Color;

/**
 * 
 * @author divyang
 * 
 */
public class Rectangle extends Shape {

	/**
	 * This Constructor Set Color of the Rectangle
	 * 
	 * @param color
	 */
	public Rectangle(Color color) {
		super(color);
	}

	/**
	 * This Method fill out the Color in Rectangle
	 */
	public void colorIt() {
		System.out.print("Rectangle filled with ");
		color.fillColor();
	}
	//

}
