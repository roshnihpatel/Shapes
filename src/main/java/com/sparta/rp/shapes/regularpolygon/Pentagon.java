package com.sparta.rp.shapes.regularpolygon;

public class Pentagon implements Shapes {

    @Override
    public double getArea(double lengthOfSide) {
        if(lengthOfSide < 0){
            return 0;
        }
        double constant = 0.25 * Math.sqrt((5*(5+(Math.sqrt(20)))));
        double area = constant * Math.pow(lengthOfSide,2);
        return (Math.round(area*100.0)/100.0);


    }

    @Override
    public String getName() {
        return "regular pentagon";
    }


}
