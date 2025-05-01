package com.nit.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner
{
  private List<Destination> destination;

    public ItineraryPlanner() {
        this.destination = new ArrayList<>();
    }
    public void addDestination(Destination d)
    {
        destination.add(d);
    }

    public List<Destination> getDestination() {
        return destination;
    }

}
