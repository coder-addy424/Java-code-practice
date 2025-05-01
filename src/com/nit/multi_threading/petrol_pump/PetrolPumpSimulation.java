package com.nit.multi_threading.petrol_pump;

public class PetrolPumpSimulation
{
    public static void main(String[] args) throws InterruptedException
    {

        PetrolPump p=new PetrolPump();
        Car [] c1={new Car("Thar",p),new Car("Mustang",p),new Car("RangRover",p)};
       Thread [] t={new Thread(c1[0]),new Thread(c1[1]),new Thread(c1[2])};
          for(Thread t1:t)
          {
              t1.start();
              t1.join();
          }
    }
}
