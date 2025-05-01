package com.nit.method_overriding;

import java.util.Spliterator;

public class MainShape {
    public static void main(String[] args) {
       Cube c=new Cube();

      double cu= c.calculateVolume(10);
      if(cu==0)
      {
          System.err.println("Error: Side length cannot be negative.");
      }
      else {
          c.getDetails();
          System.out.println("Volume of a Cube is : " + cu);
      }

        Cylinder cy=new Cylinder();

       double cyn=cy.calculateVolume(10,4);
       if(cyn==0)
       {
           System.err.println("Error: Radius and Height cannot be negative.");
       }
       else {
           cy.getDetails();
           System.out.println("Volume of a Cylinder is : " + cyn);
       }

        Sphere s=new Sphere();

        double sp=s.calculateVolume(5);
        if(sp==0)
        {
            System.err.println("Error: Radius cannot be negative.");
        }
        else {
            s.getDetails();
            System.out.println("volume of Sphere is : " + sp);
        }



    }
}
