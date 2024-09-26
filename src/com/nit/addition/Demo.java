package com.nit.addition;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two digit number :");
        int number=sc.nextInt();
        int sumOfDigits = TwoDigitSum.getSumOfDigits(number);
        System.out.println("The Sum of two digits are : "+sumOfDigits);

    }
}
