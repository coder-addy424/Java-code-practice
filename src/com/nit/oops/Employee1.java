package com.nit.oops;

public class Employee1 {
    //BLC Class
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;
    private int noOfProject;

    public void setEmployeeData(String firstN, String lastN, int emp_id, double emp_salary, int project) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.employeeId = emp_id;
        this.salary = emp_salary;
        this.noOfProject = project;
    }

    public void displayDetails()
    {
        System.out.println("First Name Of Employee is : "+firstName);
        System.out.println("Last Name Of Employee is : "+lastName);
        System.out.println("ID Of Employee is : "+employeeId);
        System.out.println("The Salary Of Employee is : "+salary);
    }

    public void calculateSalary()
    {
        if(noOfProject>5 && noOfProject<10)
        {
            salary+=5000;
        }
        else if(noOfProject>10 && noOfProject<20)
        {
            salary+=10000;
        }
        else if(noOfProject>20)
        {
            salary+=15000;
        }

        }
    }

