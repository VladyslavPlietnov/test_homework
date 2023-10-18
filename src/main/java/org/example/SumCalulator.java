package org.example;

public class SumCalulator {
    public int sum(int a) throws IllegalArgumentException{
        if(a <1){
            throw new IllegalArgumentException("value cannot be 0 or less");
        }
        {
            int i = 1;
            int result = 0;
            while (i <= a) {
                result += i;
                i++;
            }
            return result;
        }
    }

}