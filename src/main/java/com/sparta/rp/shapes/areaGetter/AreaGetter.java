package com.sparta.rp.shapes.areaGetter;

import com.sparta.rp.shapes.regularpolygon.Shapes;

public class AreaGetter {
    public static void getAreas(Shapes regularShape, double length){
        double area = regularShape.getArea(length);
        String shape = regularShape.getName();

        System.out.print("The area of a " + shape + " with length " + length + " cm is ");
        System.out.format( "%.2f", area);
        System.out.print((" cm squared \n"));
    }

}
