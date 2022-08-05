package com.sparta.rp.shapes.area.regularpolygon;

import com.sparta.rp.shapes.regularpolygon.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SquareTest {
    Square square = new Square();

    @Test
    @DisplayName("Given the length of a side is 3, return the area")
    void givenTheLengthOfASideIs3ReturnTheArea(){
        double lengthOfSide = 3.0;
        double answer = square.getArea(lengthOfSide);
        double expected = 9.0;
        Assertions.assertEquals(expected, answer);

    }
    @Test
    @DisplayName("Given the length of a side is 0, return the 0")
    void givenTheLengthOfASideIs0Return0(){
        double lengthOfSide = 0;
        double answer = square.getArea(lengthOfSide);
        double expected = 0;
        Assertions.assertEquals(expected, answer);

    }
    @Test
    @DisplayName("Given the length of a side is 5.32, return the area")
    void givenTheLengthOfASideIs532ReturnTheArea(){
        double lengthOfSide = 5.32;
        double answer = square.getArea(lengthOfSide);
        double expected = 28.30;
        Assertions.assertEquals(expected, answer);

    }
    @ParameterizedTest
    @ValueSource(doubles = {-4.3,-5.0,-6.1,-90})
    @DisplayName("Given the length of a side is negative, return 0")
    void givenTheLengthOfASideIsNegativeReturnTheArea(double negativeLength){
        double answer = square.getArea(negativeLength);
        double expected = 0;
        Assertions.assertEquals(expected, answer);

    }
    @Test
    @DisplayName("calling getName method should return square")
    void callingGetNameMethodShouldReturnSquare(){
        String answer = square.getName();
        String expected = "square";
        Assertions.assertEquals(expected, answer);

    }

}
