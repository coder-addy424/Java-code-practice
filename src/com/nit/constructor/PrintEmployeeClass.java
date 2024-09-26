package com.nit.constructor;

import java.util.Scanner;

public class PrintEmployeeClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many object you want to create : ");
        int noOfObject=sc.nextInt();
        for(int i=1;i<=noOfObject;i++)
        {
            Employee2 e2= Employee2.getEmployeeObject();
            System.out.println(e2);
        }

    }
}
