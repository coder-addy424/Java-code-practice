package com.nit.inheritance;

public class Electronics extends Product
{
    private String productBrand;

    public Electronics(String productName, double productPrice, int quantity,String productBrand) {
        super(productName, productPrice,quantity);
        this.productBrand = productBrand;
    }
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Product Brand : "+this.productBrand);
    }
}
