package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalulatorTest {
    SumCalulator calculator;
    int[] input = {1,3};
    int[] output = {1,6};
    @BeforeEach
    public void beforeEach(){
        calculator = new SumCalulator();
    }
    @Test
    public void sumTest(){
      for(int i= 0; i<input.length; i++){
         Assertions.assertEquals(output[i],calculator.sum(input[i]));
      }
        Assertions.assertThrows(IllegalArgumentException.class, ()-> calculator.sum(0));
    }

}