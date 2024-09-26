package com.nit.addition;

import java.util.Scanner;

//BLC Class
public class TwoDigitSum {
    public static int getSumOfDigits(int number)
        {
         int number1=number%10;
         int number2=number/10;
         int result=number1+number2;

        return result;
    }
}




