package com.nit.stream_API;

import java.util.ArrayList;
import java.util.List;

public class FilterEmpBySalary
{
    public static void main(String[] args)
    {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Raj",34000.00));
        employeeList.add(new Employee("Rahul",87000.00));
        employeeList.add(new Employee("Rajiv",14000.00));
        employeeList.add(new Employee("Kumar",24000.00));
        employeeList.add(new Employee("Yuvraj",94000.00));

        employeeList.stream().filter(emp->emp.empSalary()>30000).forEach(emp-> System.out.println(emp.empName()));
    }
}
