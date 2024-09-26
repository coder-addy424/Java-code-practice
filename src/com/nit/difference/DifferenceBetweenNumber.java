package com.nit.difference;

import java.util.Scanner;

public class DifferenceBetweenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for difference : ");
        int number=sc.nextInt();
        int diff=TwoDigitsDifference.getDiffOfDigits(number);
        System.out.println("The difference between two numbers are : "+diff);

    }
}
