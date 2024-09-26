package com.nit.circle;

public class Circle
    {
        public static String getAreaOfCircle(double radius)
        {
            if(radius <= 0)
            {
                return ""+(0);
            }
            else
            {
                double PI = 3.14;
                double areaOfCircle = PI * radius * radius;
                return ""+areaOfCircle;
            }
        }
    }

