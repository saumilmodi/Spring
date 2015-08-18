package com.online.bean;

import java.util.List;
import java.util.Set;

public class Square {
private List<Points> points;
private Set<Points> printsSet;


public Set<Points> getPrintsSet() {
	return printsSet;
}

public void setPrintsSet(Set<Points> printsSet) {
	this.printsSet = printsSet;
}

public List<Points> getPoints() {
	return points;
}

public void setPoints(List<Points> points) {
	this.points = points;
}
public void print()
{
	for(Points point:points)
	{
		System.out.println("("+point.getX()+","+point.getY()+")");
	}
}

public void printSets()
{
	for(Points set:printsSet)
	{
		System.out.println("Sets : ");
		System.out.println("("+set.getX()+","+set.getY()+")");
	}
}

}
