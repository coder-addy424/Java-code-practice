package com.nit.multi_threading.petrol_pump;

public class Car implements Runnable
{
    String name;
    PetrolPump petrolPump;
    public Car(String name,PetrolPump petrolPump)
    {
        this.name=name;
        this.petrolPump=petrolPump;
    }

    @Override
    public void run()
    {
        try
        {
           this.petrolPump.refillCar(name);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
