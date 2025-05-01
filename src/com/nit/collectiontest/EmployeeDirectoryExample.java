package com.nit.collectiontest;

public class EmployeeDirectoryExample
{
    public static void main(String[] args)
    {
        Employee e=new Employee("Aditya","Software engineer",34000);
        Employee e2=new Employee("nirmal","Java developer",45000);
        Directory d=new Directory();
        d.addEmployee(e);
        d.addEmployee(e2);
        d.displayEmployeeDetails();
      //d.updateEmployee(e2);
      d.deleteEmployee();
        d.displayEmployeeDetails();

    }
}
