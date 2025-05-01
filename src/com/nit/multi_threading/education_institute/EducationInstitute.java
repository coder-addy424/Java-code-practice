package com.nit.multi_threading.education_institute;

import com.nit.multi_threading.education_institute.ClassOffer;
import com.nit.multi_threading.education_institute.Course;

public class EducationInstitute
{
     Course[] courses;
     ClassOffer[] offers;
    public EducationInstitute(Course [] courses,ClassOffer [] offers)
    {
        this.courses = courses;
        this.offers = offers;
    }

    public Course[] getCourses()
    {
        return this.courses;
    }

    public ClassOffer[] getOffers()
    {
        return this.offers;
    }

    public void enrollStudentInCourse(int courseId, String studentName)
    {
        for(int i=0;i<courses.length;i++)
        {
            if(courses[i].getCourseId()==courseId)
            {
                System.out.println(studentName+" is enrolled in "+courses[i].getCourseName()+" course");
                return;
            }
        }
        System.out.println("Course Id not found");
    }
}
