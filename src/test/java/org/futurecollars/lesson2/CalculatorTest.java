package org.futurecollars.lesson2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void should_return_sum_of_5_for_2_and_3() {
        //given
        int augend = 2;
        int addend = 3;

        //when
        int sum = Calculator.sum(augend, addend);

        //then
        assertEquals(5, sum);
    }

    @Test
    void should_return_difference_of_12_for_15_and_3() {
        //given
        int minuend = 15;
        int subtrahend = 3;

        //when
        int difference = Calculator.subtract(minuend, subtrahend);

        //then
        assertEquals(12, difference);
    }
}