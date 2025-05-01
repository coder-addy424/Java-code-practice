package com.nit.collectiontest;

public class TravelItineraryPlanner
{
    public static void main(String[] args) {
        ItineraryPlanner ip=new ItineraryPlanner();
        Destination paris=new Destination("paris");
        paris.addActivity(new Activity("visit Eiffel tower","Morning"));
        paris.addActivity(new Activity("Louvre museum","Afternoon"));

        Destination london=new Destination("London");
        london.addActivity(new Activity("British Museum","Morning"));
        london.addActivity(new Activity("London Eye","Afternoon"));

        ip.addDestination(paris);
        ip.addDestination(london);

        for(Destination d:ip.getDestination())
        {
            System.out.println(d);
            System.out.println();
        }

    }
}
