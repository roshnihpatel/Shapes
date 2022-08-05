package com.sparta.rp.shapes.regularpolygon;

public class Square implements Shapes{
    @Override
    public double getArea(double lengthOfSide) {
        if(lengthOfSide < 0){
            return 0;
        }
        double area = Math.pow(lengthOfSide,2);
        return (Math.round(area*100.0)/100.0);


    }

    @Override
    public String getName() {
        return "square";
    }


    }

