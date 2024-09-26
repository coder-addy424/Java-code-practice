package com.nit.oops;

import java.util.Scanner;

public class Product {
    int productId;
    String productName;
    double productPrice;
    public void SetProductData()
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Product ID : ");
        productId=sc.nextInt();

        System.out.print("Enter the Product Name : ");
        productName=sc.nextLine();
        productName=sc.nextLine();

        System.out.print("Enter the Product Price : ");
         productPrice=sc.nextDouble();

    }

    public void getProductInfo()
    {
        System.out.println("The ID of this Product is "+productId);
        System.out.println("The price of this Product is "+productPrice);
        System.out.println(productName+" is totally waterproof and comfortable to Use");

    }
}
