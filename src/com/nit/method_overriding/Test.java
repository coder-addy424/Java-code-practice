package com.nit.method_overriding;

public class Test
{
    public static void main(String[] args){
        Mammal h = new Horse();
        Cattle c = new Horse();
        c.eat(h);
    }
}
