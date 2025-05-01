package com.nit.constructor;

public class NIT {
    final int A ;  //Blank final field

    {
        printDefaultValue();
        A = 100;
    }

    public void printDefaultValue()
    {
        System.out.println(A);
    }


    public static void main(String[] args)
    {
        NIT t1 = new NIT();
        System.out.println(t1.A);
    }
}
