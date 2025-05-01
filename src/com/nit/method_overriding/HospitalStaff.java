package com.nit.method_overriding;

public class HospitalStaff
{
    private String name;
    private int age;
    private String role;

    public HospitalStaff(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public void work()
    {
        System.out.println("Name is "+this.name+" and the Role is "+this.role+" is working");

    }
}
