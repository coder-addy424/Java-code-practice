package com.nit.inheritance;

public class Elephant extends Animal
{
    private float tuskLength;

    public Elephant(int age, String name, float tuskLength)
    {
        super(age, name);
        this.tuskLength = tuskLength;
    }


    public void makeSound()
    {
        super.makeSound();
        System.out.println("The Elephant trumpets");
    }
    public void displayTuskLength()
    {
        super.displayInfo();
        System.out.println("Length is : "+this.tuskLength);
    }
}
