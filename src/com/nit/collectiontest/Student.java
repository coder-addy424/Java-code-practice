package com.nit.collectiontest;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class Student implements Serializable
{
    private Integer studentId;
    private String studentName;
    private Double studentFees;
    private Date dateOfAdmission;

    public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentFees = studentFees;
        this.dateOfAdmission = dateOfAdmission;
    }
    public static  Student getStudentObject()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id : ");
        Integer id = sc.nextInt();
        System.out.println("Enter Student Name : ");
        String name = sc.nextLine();
        name = sc.nextLine();
        System.out.println("Enter Student Fees : ");
        Double fees = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Date of Admission : ");
        String date = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        Date dateOfAdmission=null;
        try {
             dateOfAdmission = dateFormat.parse(date);
        }catch(ParseException e)
        {
            e.printStackTrace();
        }

            return new Student(id, name, fees, dateOfAdmission);

    }
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentFees=" + studentFees +
                ", dateOfAdmission=" + dateFormat.format(dateOfAdmission) +
                '}';
    }

}
