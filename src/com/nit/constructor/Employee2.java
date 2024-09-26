package com.nit.constructor;

import java.util.Scanner;

public class Employee2 {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;
    public Employee2(int employeeId,String employeeName,double employeeSalary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
    }

        public static Employee2 getEmployeeObject()
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Id :");
            int id = sc.nextInt();
            if(id<=0)
            {
                System.err.println("Invalid Input...Employee ID must be a positive Integer");
                   System.exit(0);
            }
            System.out.print("Enter Employee Name :");
            String name = sc.nextLine();
            name = sc.nextLine();
            if(name.equals(""))
            {
                System.err.println("Invalid Name");
                System.exit(0);
            }

            System.out.print("Enter Employee Salary :");
            double sal = sc.nextDouble();
            if(sal<=0)
            {
                System.err.println("Invalid Salary");
                System.exit(0);
            }

            return new Employee2(id, name, sal);
        }
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]";
    }
}
