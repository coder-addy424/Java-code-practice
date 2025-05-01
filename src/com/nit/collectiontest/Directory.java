package com.nit.collectiontest;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory
{
    Scanner sc=new Scanner(System.in);

    ArrayList<Employee> listOfEmployee=new ArrayList<>();

    public void addEmployee(Employee e)
    {
        listOfEmployee.add(e);
    }
    public void displayEmployeeDetails()
    {
       listOfEmployee.forEach(emp-> System.out.println(emp));
    }
    public void updateEmployee(Employee e)
    {
                System.out.println("what you want to update ?");
                System.out.println("1.For update Name :");
                System.out.println("2.For update Position");
                System.out.println("3.For update salary");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
            System.out.println("Enter that name which you want to update : ");
            String name = sc.nextLine();
            e.setName(name);
                        System.out.println("Data updated Successfully");
            break;
                    case 2:
            System.out.println("Enter the Position you want to update : ");
            String position = sc.nextLine();
            e.setPosition(position);
                        System.out.println("Data updated Successfully");
            break;
                    case 3:
            System.out.println("Enter the salary you want to update : ");
            long salary = sc.nextLong();
            e.setSalary(salary);
            System.out.println("Data updated Successfully");
        }
        System.out.println();
        System.out.println(e.toString());
    }
    public void deleteEmployee()
    {
        System.out.println("Enter the index which you want to delete : ");
        int index=sc.nextInt();
        listOfEmployee.remove(index);
        System.out.println("data deleted Successfully");
    }
}
