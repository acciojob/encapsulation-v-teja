package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly read = new RWOnly();
       // read.name = "Viswa Teja";  //name has private access in com.driver.RWOnly
        read.setName("Viswa Teja");
        System.out.println(read.getName());
    }
}