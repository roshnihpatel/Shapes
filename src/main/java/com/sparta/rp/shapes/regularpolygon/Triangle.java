package com.sparta.rp.shapes.regularpolygon;

public class Triangle implements Shapes{
    @Override
    public void getArea( double lengthOfSide) {
        double area = Math.sqrt(3)/4 * Math.pow(lengthOfSide,2);
        System.out.print("The area of a square with length " + lengthOfSide + " cm is ");                System.out.format( "%.2f", area);
        System.out.print((" cm squared \n"));
    }
}
