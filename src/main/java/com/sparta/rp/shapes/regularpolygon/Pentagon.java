package com.sparta.rp.shapes.regularpolygon;

public class Pentagon implements Shapes {

    @Override
    public void getArea(double lengthOfSide) {
        double constant = 0.25 * Math.sqrt((5*(5+(Math.sqrt(20)))));
        double area = constant * Math.pow(lengthOfSide,2);
        System.out.print("The area of a square with length " + lengthOfSide + " cm is ");                System.out.format( "%.2f", area);
        System.out.print((" cm squared \n"));

    }
}
