package com.differentshape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Triangle {
	TriangleCoordinates tc;
	
	public TriangleCoordinates getTc() {
		return tc;
	}
	
	@Required
	@Autowired
	public void setTc(TriangleCoordinates tc) {
		this.tc = tc;
	}

	void printTraiangle()
	{
		System.out.println("("+getTc().getX()+","+getTc().getY()+")");
	}
}
