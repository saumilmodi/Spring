package com.differentshape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Square {
	private SquareDimensions squareDimensions;
	public SquareDimensions getSquareDimensions() {
		return squareDimensions;
	}
	@Required
	@Autowired
	public void setSquareDimensions(SquareDimensions squareDimensions) {
		this.squareDimensions = squareDimensions;
	}
	public void printSquareDimensions()
	{
		System.out.println(squareDimensions.getHeight()+"   "+squareDimensions.getWidth());
	}
}