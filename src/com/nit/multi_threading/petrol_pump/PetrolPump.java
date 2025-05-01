package com.nit.multi_threading.petrol_pump;

public class PetrolPump
{
    public synchronized void refillCar(String carName) throws InterruptedException
    {
        System.out.println(carName+" started refilling.....");
        Thread.sleep(3000);
        //notifyAll();
        System.out.println(carName+" completed refilling......");
        Thread.sleep(1000);

    }
}
