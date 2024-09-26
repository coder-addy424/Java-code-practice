package com.nit.checkevenorodd;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        boolean result=CheckEvenOrOdd.isEven(num);
        System.out.println(result);
    }
}
