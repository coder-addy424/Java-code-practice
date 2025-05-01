package com.nit.multi_threading.corona_vaccine;

public class VaccineEligibility
{
        private int age;
        private boolean hasHealthCondition;

        public VaccineEligibility(int age, boolean hasHealthCondition) {
            super();
            this.age = age;
            this.hasHealthCondition = hasHealthCondition;
        }

        public boolean isEligible()
        {
            if(this.age>=18 && this.age<=60) {
                System.out.println("your age is "+age+",So you are Eligible for vacination");
                return true;
            }
            else {

                System.err.println("Your age is "+age+" so you are not Eligible for Vaccination");
                return false;
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isHasHealthCondition() {
            return hasHealthCondition;
        }

        public void setHasHealthCondition(boolean hasHealthCondition) {
            this.hasHealthCondition = hasHealthCondition;
        }


    }


