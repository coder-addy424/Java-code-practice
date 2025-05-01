package com.nit.multi_threading.education_institute;

import com.nit.multi_threading.education_institute.EducationInstitute;

public class Student
{
    String name;
    EducationInstitute institute;//HAS-A Relation

    public Student(String name, EducationInstitute institute)
    {
        this.name = name ;
        this.institute = institute;
    }

    public void  viewCoursesAndFees()
    {
        System.out.println("Courses and fees");
        System.out.println("----------------------");
        for(int i = 0; i< institute.getCourses().length; i++)
        {
            System.out.println("Course Name : "+ institute.getCourses()[i].getCourseName()+" , Course Fee: "+institute.courses[i].courseFee);
        }

        System.out.println("------------------------------------------------------------------");

    }

    public void viewOffers()
    {
        System.out.println("Available Offers");
        System.out.println("----------------------");
        for(int i = 0; i< institute.getOffers().length; i++)
        {
            System.out.println(institute.getOffers()[i].getOfferText());
        }
    }

    public void enrollInCourse(int courseId)
    {
        institute.enrollStudentInCourse(courseId, name);
    }

}
