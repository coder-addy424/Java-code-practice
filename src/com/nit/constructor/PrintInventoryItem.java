package com.nit.constructor;


import java.util.Scanner;

public class PrintInventoryItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fruit Name : ");
        String itemName=sc.next();
        System.out.print("Enter Price of "+itemName+" per Unit : ");
        double pricePerUnit=sc.nextDouble();
        System.out.print("Enter the Quantity of "+itemName+" In Stock : ");
        int quantityInStock=sc.nextInt();
        InventoryItem IT=new InventoryItem(itemName,pricePerUnit,quantityInStock);
        IT.calculateTotalValue();
        System.out.println(IT);

    }
}
