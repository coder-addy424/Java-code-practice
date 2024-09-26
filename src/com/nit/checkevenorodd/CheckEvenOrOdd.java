package com.nit.checkevenorodd;

public class CheckEvenOrOdd {
   public static boolean isEven(int num)
   {
      if(num%2==0)
      {
          System.out.print(num+" is even number.....That's Why it is giving :");
          return true;
      }
       System.out.print(num+" is odd number....That's Why it is giving : ");
      return false;
   }
    }

