package com.nit.oops;

import java.util.Scanner;

public class GDC {
    public static int getGCD(int num1,int num2)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number : ");
        num1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        num2=sc.nextInt();
        if(num1>=0 && num2>=0)
        {
            int num3=num2%num1;
            if(num1%num3==0)
            {
                return num3;
            }
        }
        else
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        int result=GDC.getGCD(20,30);
        System.out.println(result);
    }
}
