package com.nit.exception_handling;

public class IllegalStateExceptionDemo
{
    public static void main(String[] args)
    {
        try{
            throw new IllegalStateException("MyException");
        }
        catch(IllegalStateException e)
        {
            System.out.println("Calling throwIllegalException from main method :");
            System.out.println("Caught : "+e);
        }
    }
}
