package com.nit.method_overriding;

public class Cylinder extends Shape
{

    public double calculateVolume(double radius,double height)
    {
        if(radius<=0 || height<=0)
        {
            return 0.0;
        }
       final double PI=3.14;
       return PI*radius*radius*height;
    }
    public void getDetails()
    {
        System.out.println("It is a Cylinder");
    }
}
