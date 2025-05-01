package com.nit.abstract_class;

abstract class Shape
{
    abstract double getArea();
    abstract double printDetails();
}
class Rectangle extends Shape
{
 double length;
 double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double getArea()
    {
        double area=length*breadth;
        return area;
    }

    @Override
    double printDetails()
    {
        System.out.println("Type = Rectangle");
        System.out.println("Length = "+this.length);
        System.out.println("Breadth = "+this.breadth);
        System.out.println("Area = "+getArea());

        return 0.0;
    }
}
class Circle extends Shape
{
    final double PI=3.14;
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    double getArea()
    {
        double area=PI*radius*radius;
        return area;
    }

    @Override
    double printDetails()
    {
        System.out.println("Type = Circle");
        System.out.println("Radius = "+this.radius);
        System.out.println("Area = "+getArea());
        return 0.0;
    }
}
class Triangle extends Shape
{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea()
    {
        double area=base*height;
        return area;
    }

    @Override
    double printDetails()
    {
        System.out.println("Type = Triangle");
        System.out.println("Base = "+this.base);
        System.out.println("Height = "+this.height);
        System.out.println("Area = "+getArea());

        return 0.0;
    }
}
