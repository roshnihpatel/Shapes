package com.sparta.rp.shapes.loader;

import com.sparta.rp.shapes.regularpolygon.Pentagon;
import com.sparta.rp.shapes.regularpolygon.Shapes;
import com.sparta.rp.shapes.regularpolygon.Square;
import com.sparta.rp.shapes.regularpolygon.Triangle;

public class ShapeAreaLoader {
    public static void getAreas(int lengthOfSide){
        Pentagon pentagon = new Pentagon();
        Triangle triangle = new Triangle();
        Square square = new Square();

        Shapes [] shapes = {triangle, square, pentagon};
        for(Shapes shape : shapes){
            shape.getArea(lengthOfSide);
        }



    }


}
