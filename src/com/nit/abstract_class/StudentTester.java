package com.nit.abstract_class;

import com.nit.method_overriding.HospitalStaff;

public class StudentTester
{
    public static void main(String[] args) {
        ScienceStudent ss=new ScienceStudent("Aditya","9th class",34,50,50);
       int totalPercentage= ss.getPercentage();
        int totalStudents=Student.getTotalNoStudents();
        System.out.println(totalPercentage+" % marks in the Examination");
        System.out.println("Total Number of Students are present in the Examination Hall is : "+totalStudents);
        System.out.println();
        HistoryStudent hs=new HistoryStudent("Nirmal","12th",57,84);
        int totalPercentage1= hs.getPercentage();
        int totalStudents1=Student.getTotalNoStudents();
        System.out.println(totalPercentage1+" % marks in the Examination");
        System.out.println("Total Number of Students are present in the Examination Hall is : "+totalStudents1);
    }
}
