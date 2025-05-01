package com.nit.exception_handling;

import java.util.Scanner;

public class ArrayStoreExample
{

     public static void storeObject()
     {

         try
         {
             Object[] s = new String[3];
             s[0]="java";
             s[1]="rr";
             s[2]=123;

         }
          catch(ArrayStoreException e)
         {

             System.err.println("Error found");
             System.out.println(e.toString());
         }
         System.out.println("Object stored Successfully");

     }
    public static void main(String[] args) {
          storeObject();
    }
}
