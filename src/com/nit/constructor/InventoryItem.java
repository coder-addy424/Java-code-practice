package com.nit.constructor;

public class InventoryItem {
        String itemName;
        double pricePerUnit;
        int quantityInStock;
        double totalValue=0;

        public InventoryItem(String itemName, double pricePerUnit, int quantityInStock)
        {
            super();
            this.itemName = itemName;
            if(pricePerUnit<=0)
            {
                System.err.println("price should not be negative ");
            }
            else
            {
                this.pricePerUnit = pricePerUnit;
            }
            this.pricePerUnit = pricePerUnit;
            this.quantityInStock = quantityInStock;
        }
        public double calculateTotalValue()
        {
            totalValue=totalValue+ (pricePerUnit*quantityInStock);

            return totalValue;
        }

        @Override
        public String toString() {
            return "[itemName=" + this.itemName + ", pricePerUnit=" + this.pricePerUnit + ", quantityInStock="
                    + this.quantityInStock + ", totalValue=" + this.totalValue+"]";
        }

    }

