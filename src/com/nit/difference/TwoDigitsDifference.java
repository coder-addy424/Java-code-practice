package com.nit.difference;

public class TwoDigitsDifference {
    public static int getDiffOfDigits(int number)
    {
        int number1=number/10;
        int number2=number%10;
        int result=number1-number2;
        return result;
    }
}
