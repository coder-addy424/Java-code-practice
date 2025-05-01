package com.nit.collectiontest;

public class CabCustomerServiceTester
{
    public static void main(String[] args) {
        CabCustomer c1=new CabCustomer(101,"Aditya","Ameerpet","Miyapur",14,"8102622606");
        CabCustomerService cs=new CabCustomerService();

       System.out.println(cs.printBill(c1));

        CabCustomer c2=new CabCustomer(102,"Nirmal","S.R.Nagar","Banjara Hills",20,"2323235656");
        CabCustomerService cs1=new CabCustomerService();
        System.out.println(cs1.printBill(c2));

        CabCustomer c3=new CabCustomer(103,"Piyush","E.S.i Hospital","Kukatpally",5,"8102622606");
        CabCustomerService cs2=new CabCustomerService();
        cs2.addCabCustomer(c3);
        cs2.isFirstCustomer(c3);
    }
}
