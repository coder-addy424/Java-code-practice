package com.nit.method_overriding;

public class Car extends Vehicle
{
    public Car(double totalDistance, double totalFuelConsumed) {
        super(totalDistance, totalFuelConsumed);
    }
    public double calculateFuelEfficiency(int kiloMeters,int liter)
    {
        return (double)2.35215 *(kiloMeters/liter);
    }
    public double calculateFuelEfficiency(double miles, int gallon)
    {
        return miles/gallon;
    }
}
