package com.online.spel;

import java.util.*;

public class CityList {

	private List<City> cities;

	CityList() {
        cities = new ArrayList<City>();
        City city1=new City("Hyderabad", 3500);
        City city2=new City("Bangalore", 5500);
        City city3=new City("Chennai", 2500);
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
