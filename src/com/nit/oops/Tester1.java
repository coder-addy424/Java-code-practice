package com.nit.oops;

import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {
        Employee1 E1=new Employee1();
        Scanner in=new Scanner(System.in);

        System.out.print("Enter Employee First Name : ");
        String firstN=in.nextLine();


        System.out.print("Enter Employee Last Name : ");
        String lastN=in.nextLine();


        System.out.print("Enter Employee ID : ");
        int emp_id=in.nextInt();

        System.out.print("Enter Employee Salary : ");
        double emp_salary=in.nextDouble();

        System.out.print("Enter the Number Of Project : ");
        int project=in.nextInt();

        //Call the Behavior
        E1.setEmployeeData(firstN,lastN,emp_id,emp_salary,project);
        E1.calculateSalary();
        E1.displayDetails();
    }
}
