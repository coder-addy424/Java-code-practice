package com.nit.scenario_program;

import java.util.Scanner;

public class ELC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String name=sc.nextLine();
        System.out.print("Enter Student Marks : ");
        int marks=sc.nextInt();
        Student stud=new Student(name,marks);
        StudentGrade grade=CalculateStudentGrade.calculateGrade(stud);
        System.out.println(grade);
    }
}
