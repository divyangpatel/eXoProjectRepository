package com.shape;

import com.color.Color;

/**
 * 
 * @author divyang
 * 
 */
public class Circle extends Shape {

	/**
	 * This Constructor Set Color of the Circle
	 * 
	 * @param color
	 */
	public Circle(Color color) {
		super(color);

	}

	/**
	 * This Method fill out the Color in Circle
	 */
	public void colorIt() {
		System.out.print("Circle filled with ");
		color.fillColor();
	}

}
