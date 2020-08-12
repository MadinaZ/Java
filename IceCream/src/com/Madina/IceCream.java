package com.Madina;

import java.lang.Math;

public class IceCream {
    private double radius;
    private double height;

    public IceCream(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getArea(){
         return (Math.PI * radius * Math.sqrt(height * height + radius * radius));
    }
}
