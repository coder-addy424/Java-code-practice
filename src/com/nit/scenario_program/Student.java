package com.nit.scenario_program;

public class Student {
    private String studentName;
    private int studentMarks;

    public Student(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentMarks(int studentMarks) {
        this.studentMarks = studentMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentMarks() {
        return studentMarks;
    }

    @Override
    public String toString() {
        return ""+this.studentName;
    }
}

