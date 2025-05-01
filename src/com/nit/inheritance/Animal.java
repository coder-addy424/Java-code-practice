package com.nit.inheritance;

public class Animal {
    private int age;
    private String name;

    public Animal(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public void makeSound()
    {
        System.out.println("The Animal makes a generic Sound ");
    }
    public void displayInfo()
    {
        System.out.println("Age is : "+this.age);
        System.out.println("Name of Animal is : "+this.name);
    }
}
