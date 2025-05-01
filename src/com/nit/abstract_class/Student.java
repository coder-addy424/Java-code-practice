package com.nit.abstract_class;

abstract class Student
{
    protected String studentName;
    protected String studentClass;
    protected static int totalNoOfStudents;

    public Student(String studentName, String studentClass) {
        this.studentName = studentName;
        this.studentClass = studentClass;
        totalNoOfStudents++;
    }


    public static int getTotalNoStudents()
    {

        return totalNoOfStudents;
    }
    public abstract int getPercentage();

}
class ScienceStudent extends Student
{
    private int phyMarks;
    private int cheMarks;
    private int mathMarks;

    public ScienceStudent(String studentName, String studentClass, int phyMarks, int cheMarks, int mathMarks) {
        super(studentName, studentClass);
        this.phyMarks = phyMarks;
        this.cheMarks = cheMarks;
        this.mathMarks = mathMarks;
    }

    @Override
    public int getPercentage()
    {

        if(phyMarks>100||cheMarks>100||mathMarks>100)
        {
            System.err.println("Please write Correct Marks");
            return 0;
        }
        else {
            System.out.print("Name of Student is "+studentName+" who got ");
            int totalMarks=phyMarks+cheMarks+mathMarks;
            int totalPercentage = (totalMarks / 3) ;
            return totalPercentage;
        }

    }
}
class HistoryStudent extends Student
{
    private int historyMarks;
    private int civicsMarks;

    public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
        super(studentName, studentClass);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
    }

    @Override
    public int getPercentage()
    {
        if(historyMarks>100||civicsMarks>100)
        {
            System.err.println("Please write Correct Marks");
        }
        else {
            System.out.print("Name of Student is "+studentName+" who got ");
            int totalPercentage = ((historyMarks+civicsMarks) / 2) ;
            return totalPercentage;
        }
        return 0;
    }
}