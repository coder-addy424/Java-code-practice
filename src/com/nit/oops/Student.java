package com.nit.oops;

public class Student {
    //BLC Class
    private int studID;
    private String studName;
    private int marks;
    private char grade;

    public void setStudentData(int studentID,String studentName,int studMarks)
    {
        this.studID=studentID;
        this.studName=studentName;
        this.marks=studMarks;
    }

    public String displayDetails()
    {
        return ""+"[name="+studName+", studentID= "+studID+", Marks= "+marks+", Grade= "+this.grade+"]";
    }

    public void calculateGrade()
    {
        if(marks>90)
        {
            this.grade='A';
        } else if (marks>80&&marks<=90) {

            this.grade='B';
        }

        else if (marks>70&&marks<=80) {

            this.grade='C';
        }

        else if (marks>60&&marks<=70) {

            this.grade='D';
        }
        else
        {
            this.grade='E';
        }

    }

}
