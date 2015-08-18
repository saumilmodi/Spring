package com.online.spel;

public class City {
	private String name;
    private int people;
    
    City(String name, int people) {
        this.name = name;
        this.people = people;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPeople() {
        return people;
    }
    public void setPeople(int people) {
        this.people = people;
    }
    
}
