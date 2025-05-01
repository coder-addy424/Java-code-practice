package com.nit.exception_handling;

public class ArrayIndexExceptionDemo
{
    public static void main(String[] args)
    {
        try {
            System.out.println("Main method Started!!");
            int a[] = {1,4,5};
            System.out.println(a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("An ArrayIndexOutOfBoundsException occurred");
            System.out.println("Message : Index 3 out of bounds for length 2 ");
            System.out.println("String Representation : "+e.getMessage());
            System.out.println("Stack Trace : ");
            e.printStackTrace();



        }

    }
}
