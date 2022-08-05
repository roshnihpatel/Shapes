package com.sparta.rp.shapes.area.regularpolygon;

import com.sparta.rp.shapes.regularpolygon.Triangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TriangleTest {
    Triangle triangle = new Triangle();
    @Test
    @DisplayName("Given the length of a side is 3, return the area")
    void givenTheLengthOfASideIs3ReturnTheArea(){
        double lengthOfSide = 3.0;
        double answer = triangle.getArea(3.00);
        double expected = 3.90;
        Assertions.assertEquals(expected, answer);

    }
    @Test
    @DisplayName("Given the length of a side is 0, return the 0")
    void givenTheLengthOfASideIs0Return0(){
        double lengthOfSide = 0;
        double answer = triangle.getArea(lengthOfSide);
        double expected = 0;
        Assertions.assertEquals(expected, answer);

    }
    @Test
    @DisplayName("Given the length of a side is 5.32, return the area")
    void givenTheLengthOfASideIs532ReturnTheArea(){
        double lengthOfSide = 5.32;
        double answer = triangle.getArea(lengthOfSide);
        double expected = 12.26;
        Assertions.assertEquals(expected, answer);

    }
    @ParameterizedTest
    @ValueSource(doubles = {-4.3,-5.0,-6.1,-90})
    @DisplayName("Given the length of a side is negative, return 0")
    void givenTheLengthOfASideIsNegativeReturnTheArea(double negativeLength){
        double answer = triangle.getArea(negativeLength);
        double expected = 0;
        Assertions.assertEquals(expected, answer);

    }
    @Test
    @DisplayName("calling getName method should return equilateral triangle")
    void callingGetNameMethodShouldReturnEquilateralTriangle(){
        String answer = triangle.getName();
        String expected = "equilateral triangle";
        Assertions.assertEquals(expected, answer);

    }
}
