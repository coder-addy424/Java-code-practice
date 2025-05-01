package com.nit.exception_handling;

import java.util.Scanner;

public class ExceptionHandlingDemo
{
    public static void handleExceptions(String s)
    {
      try{
          System.out.println("Length of Input String is : "+s.length());
          int i = Integer.parseInt(s);
          System.out.println("Converted Number : "+i);
      }
      catch(NullPointerException n)
      {
          System.out.println("Catch NullPointerException Occurred : ");
          System.err.println("String is null....Please enter some value.");
          System.err.println("NullPointerException : Attempted to operate on a null object.");
          n.getMessage();
          n.printStackTrace();
      }
      catch(NumberFormatException e)
      {
          System.out.println("Catch NumberFormatException Occurred : ");
          System.err.println("NumberFormatException : Invalid input,not a number.");
          e.getMessage();
          e.printStackTrace();
      }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String to convert to an integer : ");
        String s=sc.nextLine();
        handleExceptions(null);
        sc.close();
    }
}
