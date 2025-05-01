package com.nit.inheritance;

public class Lion extends Animal
{
    private int maneLength;

    public Lion(int age, String name, int maneLength) {
        super(age, name);
        this.maneLength = maneLength;
    }
    public void makeSound()
    {
        super.makeSound();
        System.out.println("The Lion roars loudly");
    }
    public void displayManeLength()
    {
        super.displayInfo();
        System.out.println("Length is : "+this.maneLength);
    }
}
