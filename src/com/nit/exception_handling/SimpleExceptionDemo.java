package com.nit.exception_handling;
import java.util.*;
public class SimpleExceptionDemo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter the First Integer : ");
            int a=sc.nextInt();
            System.out.print("Enter the Second Integer : ");
            int b=sc.nextInt();
            System.out.println("You entered a = "+a+" and b = "+b);

        }
        catch(InputMismatchException e)
        {
            System.out.println("An InputMismatchException occurred");
            System.out.println("Message : null");
           e.getMessage();
           e.printStackTrace();
           e.toString();
        }
    }
}
