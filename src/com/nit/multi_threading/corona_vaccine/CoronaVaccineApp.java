package com.nit.multi_threading.corona_vaccine;

public class CoronaVaccineApp
{
        public static void main(String[] args) {
            User user1=new User("Prem Verma", 64, false);
            User user2=new User("Tiwari", 30, false);
            Runnable r1=()->{
                try {
                    if(user1.isEligible())
                    {
                        System.out.println(user1.getName()+" is Eligible for vaccination");
                    }
                    else {
                        System.err.println(user1.getName()+" is not Eligible for vaccination");
                    }

                }catch(RuntimeException e)
                {
                    System.out.println(e.getMessage());
                }
            };

            Thread t1=new Thread(r1);
            t1.start();


            Runnable r2=()->{
                try {
                    if(user2.isEligible())
                    {
                        System.out.println(user2.getName()+" is Eligible for vaccination");
                    }
                    else {
                        System.err.println(user2.getName()+" is not Eligible for vaccination");
                    }

                }catch(RuntimeException e)
                {
                    System.out.println(e.getMessage());
                }
            };
            Thread t2=new Thread(r2);
            t2.start();
        }
    }


