package com.nit.abstract_class;

public class ShapeTesting
{
    public static void main(String[] args) {

        Triangle t=new Triangle(146.2,40.0);
        t.printDetails();
        Rectangle r=new Rectangle(30.3,45.5);
        r.printDetails();
        System.out.println("-----------");
        Circle c=new Circle(23.2);
        c.printDetails();
        System.out.println("-----------");
    }
}
