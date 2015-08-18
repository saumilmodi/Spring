package com.online.spel;

import java.util.*;

public class UserBean {

	private int userid;
    private String username;
    private List<City> bigcities; // cities
    private List<String> Citynames; // city names
    private Department d1;

    public Department getD1() {
        return d1;
    }
    public void setD1(Department d1) {
        this.d1 = d1;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public List<City> getBigcities() {
        return bigcities;
    }
    public void setBigcities(List<City> bigcities) {
        this.bigcities = bigcities;
    }
    public List<String> getCitynames() {
        return Citynames;
    }
    public void setCitynames(List<String> Citynames) {
        this.Citynames = Citynames;
    }
    
    public String displayUser() {
        System.out.print("Cities: ");
        for (String obj : Citynames) {
            System.out.print(obj + "\t");
        }

        System.out.println("\nBig Cities: ");
        for (City obj : bigcities) {
            System.out.println(obj.getName()+" "+obj.getPeople());
        }
        
        return " City Names="+Citynames+" userid = " + userid + ", username = " + username + " " + d1;
    }

}
