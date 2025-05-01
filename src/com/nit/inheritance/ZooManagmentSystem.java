package com.nit.inheritance;

public class ZooManagmentSystem
{
    public static void main(String[] args) {
        Lion l=new Lion(15,"Shera",10);
        l.makeSound();
        l.displayManeLength();
        System.out.println("====================");
        Elephant e=new Elephant(20,"Haathi",20);
        e.makeSound();
        e.displayTuskLength();
    }
}
