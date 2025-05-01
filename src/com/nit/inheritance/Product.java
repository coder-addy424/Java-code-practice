package com.nit.inheritance;

public class Product
{
    protected String productName;
    protected double productPrice;
    protected int quantity;

    public Product(String productName, double productPrice,int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity=quantity;
    }
    public void displayInfo()
    {
        System.out.println("Product name : "+this.productName);
        System.out.println("Product price : "+this.productPrice);
       double total=calculateTotalCost(this.quantity);
        System.out.println("Total Cost is : "+total);
    }
    public double calculateTotalCost(int quantity)
    {
       double  totalCost=this.productPrice*quantity;
        System.out.println("Total Quantity is :"+quantity);
       return totalCost;
    }
}
