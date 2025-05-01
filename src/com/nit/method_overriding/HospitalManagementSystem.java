package com.nit.method_overriding;

public class HospitalManagementSystem
{
    public static void main(String[] args)
    {
        Doctor d=new Doctor("Aditya",23,"Doctor"," Heart Specialist");
        d.work();
        System.out.println();
       Nurse n=new Nurse("pooja",23,"Nurse",5);
       n.work();
    }
}
