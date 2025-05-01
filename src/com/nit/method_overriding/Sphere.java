package com.nit.method_overriding;

public class Sphere extends MainShape
{
    public double calculateVolume(double radius)
    {
        if(radius<=0)
        {
            return 0.0;
        }
        final double PI=3.14;
       return (4/3)*PI*radius*radius;
    }
    public void getDetails()
    {
        System.out.println("It is a Sphere");
    }
}
