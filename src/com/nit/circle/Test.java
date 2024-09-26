package com.nit.circle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius : ");
            double radius = sc.nextDouble();

            String circle = Circle.getAreaOfCircle(radius);
            double area = Double.parseDouble(circle);


            DecimalFormat df = new DecimalFormat("00.00");
            System.out.println("Area of Circle is :"+df.format(area));
            sc.close();
        }
    }

