package com.nit.oops;

import java.util.Scanner;

public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;

    public void setEmployeeData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Employee Id : ");
        employeeId=sc.nextInt();


        System.out.print("Enter the Employee Name : ");
        employeeName=sc.nextLine();
        employeeName=sc.nextLine();

        System.out.print("Enter the Employee Salary : ");
        employeeSalary=sc.nextDouble();
    }

    public void getEmployeeData()
    {
        System.out.println("The ID of Employee is : "+employeeId);
        System.out.println("The Name of Employee is : "+employeeName);
        System.out.println("Salary of "+employeeName+" is : "+employeeSalary);

    }

}
