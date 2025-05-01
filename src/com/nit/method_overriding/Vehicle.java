package com.nit.method_overriding;

public class Vehicle
{
    private double totalDistance;
    private double totalFuelConsumed;

    public  double calculateFuelEfficiency(int kiloMeters,int liter)
    {
        return (double)2.35215 *(kiloMeters/liter);
    }
    public Vehicle(double totalDistance, double totalFuelConsumed) {
        this.totalDistance = totalDistance;
        this.totalFuelConsumed = totalFuelConsumed;
    }


    public double calculateFuelEfficiency(double miles, int gallon)
    {
        return miles/gallon;
    }
}
