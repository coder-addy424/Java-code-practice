package com.nit.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class CabCustomerService
{
    private List<CabCustomer> listOfCabCustomer=new ArrayList<>();

    public void addCabCustomer(CabCustomer c)
    {
        listOfCabCustomer.add(c);
    }
    public boolean isFirstCustomer(CabCustomer c1)
    {
        for(CabCustomer cc:listOfCabCustomer)
        {
            if(cc.getPhone().equals(c1.getPhone()))
            {
                System.out.println("Customer already exists");
                return false;
            }
        }
        System.out.println("New Customer added");
        return true;
    }
    public double calculateBill(CabCustomer c)
    {
        if(c.getDistance()==0)
        {
            return 0.0;
        }
        else if(c.getDistance()<=4)
        {
            return 80.0;
        }
        else
        {
            return 80+6*(c.getDistance()-4);
        }
    }
    public String printBill(CabCustomer c)
    {
        return c.getCustName()+" Please pay your bill of Rs "+this.calculateBill(c);
    }


}
