package com.nit.oops;
import java.util.Scanner;

import static com.nit.oops.EmployeeSalary.calculateSalary;

public class EmployeeSalary {



        public static double calculateSalary(double salary)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Salary:");
             salary=sc.nextDouble();
            if(salary>=40000)
            {
                salary=salary-(salary/10);
                return salary;
            }
            if(salary<40000)
            {
                salary=salary-(salary/20);
                return salary;
            }
            return salary;
        }
    }

    //ELC class
    class TestEmployeeSalary
    {
        public static void main(String [] args)
        {
            double salResult= calculateSalary(40000);
            System.out.println("Final salary after tax deduction "+salResult);
        }
    }

