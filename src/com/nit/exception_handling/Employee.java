package com.nit.exception_handling;

public class Employee
{
    private String employeeName;
    private String nationality;
    private double salary;
    public Employee()
    {

    }

    public Employee(String employeeName, String nationality, double salary) {
        this.employeeName = employeeName;
        this.nationality = nationality;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getNationality() {
        return nationality;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
