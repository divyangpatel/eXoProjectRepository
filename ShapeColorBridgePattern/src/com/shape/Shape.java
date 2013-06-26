package com.shape;

import com.color.Color;

/**
 * @author divyang
 * 
 */
public abstract class Shape {

	Color color;

	/**
	 * This Constructor Set the Color of the Shape
	 * 
	 * @param color
	 */
	Shape(Color color) {
		this.color = color;
	}

	/**
	 * This method fill out Color in Shape
	 */
	abstract public void colorIt();

	/**
	 * This method set the color of the Shape
	 * 
	 * @param color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
}
