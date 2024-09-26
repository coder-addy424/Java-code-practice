package com.nit.scenario_program;

public class CalculateStudentGrade {
    public static StudentGrade calculateGrade(Student s)
    {
         int marks= s.getStudentMarks();

         if(marks>90)
         {
            return new StudentGrade(s,'A');
         }
         else if(marks<=90&&marks>=75)
         {
             return new StudentGrade(s,'B');
         }
         else if(marks<75&&marks>=60)
         {
             return new StudentGrade(s,'C');
         }
         else
         {
             return new StudentGrade(s,'D');
         }
    }
}
