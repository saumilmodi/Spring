package com.online.bean;

import org.springframework.beans.factory.annotation.Required;

public class Triangle {
Point a;
Point b;
Point c;

public Triangle()
{
	
}
public Triangle(Point a, Point b, Point c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}
public Point getA() {
	return a;
}
public void setA(Point a) {
	this.a = a;
}
public Point getB() {
	return b;
}
public void setB(Point b) {
	this.b = b;
}
public Point getC() {
	return c;
}
public void setC(Point c) {
	this.c = c;
}
void printTriangle()
{
	System.out.println("Coordinates are : ");
	System.out.println("("+a.getX()+","+a.getY()+")");
	System.out.println("("+b.getX()+","+b.getY()+")");
	System.out.println("("+c.getX()+","+c.getY()+")");
}
}
