package com.nit.multi_threading.corona_vaccine;

public class User
    {
        private String name;
        private VaccineEligibility eligibility;
        private DoseBooking doseBooking;

        public User(String name, int age,boolean hasHealthCondition) {
            super();
            this.name = name;
            this.eligibility = new VaccineEligibility(age, hasHealthCondition);
        }

        public boolean isEligible()
        {
            if(eligibility.isEligible())
            {
                return true;
            }
            else {
                return false;
            }

        }

        public void bookDose()
        {
            System.out.print(name+" your ");
            doseBooking.bookDose();
        }
        public void isDoseBooked()
        {
            System.out.print(name);
            doseBooking.isDoseBooked();
        }
        public String getName()
        {
            return this.name;
        }
    }


