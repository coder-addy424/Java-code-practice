package com.nit.oops;

public class Fan {
    int wings;
   String name,coil;

    public void switchOn()
    {
        System.out.println("The Coil of Fan is "+coil);
        System.out.println("The Company Name of Fan is "+name);
        System.out.println("There are "+wings+" Wings in this Fan");
        System.out.println("Fan is swing");
    }
    public void switchOff()
    {
        System.out.println("Fan is off");
    }
}
