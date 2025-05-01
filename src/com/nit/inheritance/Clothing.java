package com.nit.inheritance;

public class Clothing extends Product
{
    private String clothSize;

    public Clothing(String productName, double productPrice,int quantity, String clothSize) {
        super(productName, productPrice,quantity);
        this.clothSize = clothSize;
    }


    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Cloth Size : "+this.clothSize);
    }
}
