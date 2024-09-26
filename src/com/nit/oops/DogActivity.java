package com.nit.oops;

public class DogActivity {
    public static void main(String[] args) {
        Dog tiwari=new Dog();
        //prperties of Dog
        tiwari.age=12;
        tiwari.height=3.5;
        tiwari.name="Chandu Tiwari";

        //Behaviour of Dog
        tiwari.getDogInformation();
        tiwari.bark();


    }
}
