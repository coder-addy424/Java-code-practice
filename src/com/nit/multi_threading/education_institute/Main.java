package com.nit.multi_threading.education_institute;

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        Course course1 = new Course(101, "Mathematics", 1500);
        Course course2 = new Course(102, "Physics", 1000);
        Course course3 = new Course(103, "Chemistry", 1300);

        ClassOffer offer1 = new ClassOffer("get 15% off on all courses!!");
        ClassOffer offer2 = new ClassOffer("Get enroll in two courses and get free one additional course!!");

        Course[] courses = { course1, course2, course3 };
        ClassOffer[] offers = { offer1, offer2 };

        EducationInstitute institute = new EducationInstitute(courses, offers);


        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                Student student1 = new Student("Dhoni", institute);
                student1.viewCoursesAndFees();
                student1.viewOffers();
                student1.enrollInCourse(101);
            }
        };
        Runnable r2 = new Runnable()
        {

            @Override
            public void run() {
                Student student2 = new Student("Kohli", institute);
                student2.viewCoursesAndFees();
                student2.viewOffers();
                student2.enrollInCourse(102);

            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t1.join();
        t2.start();
    }

}
