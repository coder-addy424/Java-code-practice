package com.nit.nextmultiple;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for get the next multiple : ");
       int number=sc.nextInt();
        int mul=NextMultipleOfHundred.getNextMultipleOfHundred(number);
        System.out.println("Next multiple of this number is : "+mul);
    }
}
