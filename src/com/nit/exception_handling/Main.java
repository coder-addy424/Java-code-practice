package com.nit.exception_handling;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       try(sc)
       {
           System.out.print("Enter Employee Name : ");
           String name=sc.nextLine();
           System.out.print("Enter Employee Nationality : ");
           String nationality=sc.nextLine();
           System.out.print("Enter Employee Salary : ");
           double salary=sc.nextDouble();

           Employee emp=new Employee(name,nationality,salary);
           TaxCalculate tax=new TaxCalculate();
           Double totalTax=tax.calculateTax(emp);
           System.out.println("Total Tax is : "+totalTax);
       }
       catch(CountryNotValidException | NameNotValidException | NotEligibleForTaxException e)
       {
           System.out.println(e.toString());
       }
        System.out.println("ThankYou for visiting my application");
    }
}
