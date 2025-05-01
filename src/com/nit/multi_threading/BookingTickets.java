package com.nit.multi_threading;

 class Customer implements Runnable
{
    int availableSeat=5;
    int wantedSeat;
    public Customer(int wantedSeat)
    {
        this.wantedSeat=wantedSeat;
    }

    @Override
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(availableSeat>=wantedSeat)
        {
            System.out.println(name+" has got the ticket");
            availableSeat=availableSeat-wantedSeat;
        }
        else
        {
            System.err.println("Sorry!! "+name+" : Ticket is not available for you");
        }
    }
}

 public class BookingTickets
{
    public static void main(String[] args) {
        Customer c=new Customer(5);
        Thread nirmal=new Thread(c,"Nirmal");
        Thread chandu=new Thread(c,"Chandu");
        nirmal.start();
        chandu.start();
    }
}
