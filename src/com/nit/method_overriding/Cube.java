package com.nit.method_overriding;

public class Cube extends Shape
{
    public double calculateVolume(double sideLength)
    {
        if(sideLength<=0)
        {
            return 0.0;
        }
        return sideLength*sideLength*sideLength;
    }
    public void getDetails()
    {
        System.out.println("It is a Cube");
    }
}
