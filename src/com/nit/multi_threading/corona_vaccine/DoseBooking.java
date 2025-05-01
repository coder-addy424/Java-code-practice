package com.nit.multi_threading.corona_vaccine;

public class DoseBooking
{

        private boolean booked=false;



        public void bookDose()
        {
            if(isDoseBooked())
            {
                throw new RuntimeException("Dose is  Booked Already");
            }
        }
        public boolean isDoseBooked()
        {
            System.out.println("Your Dose is booked!!!");
            return true;
        }

    }

