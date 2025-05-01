package com.nit.method_overriding;

public class Shapes {
    public static Shapes randshape() {
        switch ((int) (Math.random() * 3)) {
            case 0: return new Circle();
            case 1: return new Traingle();
            case 2: return new Square();
            default: return new Shapes();
        }

    }
    public void draw()
    {
        System.out.println("Shape Draw");
    }
    public void erase()
    {
        System.out.println("shape Erase");
    }
}
class Circle extends Shapes
{
    public void draw()
    {
        System.out.println("Circle Draw");
    }
    public void erase()
    {
        System.out.println("Circle Erase");
    }
}
class Traingle extends Shapes
{
    public void draw()
    {
        System.out.println("Traingle Draw");
    }
    public void erase()
    {
        System.out.println("Traingle Erase");
    }
}
class Square extends Shapes
{
    public void draw()
    {
        System.out.println("Square Draw");
    }
    public void erase()
    {
        System.out.println("Square Erase");
    }
}
