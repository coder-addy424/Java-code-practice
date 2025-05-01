package com.nit.method_overriding;

public class MainClass
{
    public static void main(String[] args) {
        Car c= new Car(300,5);
      double c1=  c.calculateFuelEfficiency(30,5);
        System.out.println(c1);
    }
}
