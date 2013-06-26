package com.shape;

import com.color.Color;

/**
 * 
 * @author divyang
 * 
 */
public class Square extends Shape {
	/**
	 * This Constructor Set Color of the Square
	 * 
	 * @param color
	 */
	public Square(Color color) {
		super(color);

	}

	/**
	 * This Method fill out the Color in  Square
	 */
	public void colorIt() {

		System.out.print("Square filled with ");
		color.fillColor();

	}

}
