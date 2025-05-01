package com.nit.abstract_class;

import java.util.Scanner;

public class FoodTesting
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Food items : ");
        int n=sc.nextInt();
        switch(n)
        {
            case 1: Egg e=new Egg(4.0,1.1,13.8);
                     String type=e.getType();
                System.out.println(type);
                e.getMacroNutrients();
                 int taste= e.getTastyScore();
                System.out.println("Taste : "+taste);

                break;

            case 2: Bread b=new Bread(4.0,1.1,12.4);
                String type1=b.getType();
                System.out.println(type1);
                b.getMacroNutrients();
                int taste1= b.getTastyScore();
                System.out.println("Taste : "+taste1);

        }
    }
}
