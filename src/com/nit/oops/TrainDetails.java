package com.nit.oops;
import java.util.Scanner;
public class TrainDetails {
    long trainId;
    String trainName;
    double trainTicketPrice;

    public void setTrainData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Train Id : ");
        trainId= sc.nextLong();

        System.out.print("Enter Train Name: ");
        trainName=sc.nextLine();
        trainName=sc.nextLine();

        System.out.print("Enter Ticket price for "+trainName+" :");
        trainTicketPrice=sc.nextDouble();

    }

    public void getTrainData()
    {
        System.out.println("The ID of "+trainName+" is : "+trainId);
        System.out.println("Train Name is : "+trainName);
        System.out.println("Ticket Price of the "+trainName+" is :"+trainTicketPrice);
    }
}
