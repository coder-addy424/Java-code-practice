package com.nit.constructor;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee raj=new Employee(23,"RAj","Sales",50000);
        raj.updateSalary("");
        System.out.println(raj);
    }
}
