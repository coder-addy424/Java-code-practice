package com.nit.collectiontest;

public class CabCustomer
{
    private int custId;
    private String custName;
    private String pickUpLoaction;
    private String dropLocation;
    private double distance;
    private String phone;

    public CabCustomer() {
    }

    public CabCustomer(int custId, String custName, String pickUpLoaction, String dropLocation, double distance, String phone) {
        this.custId = custId;
        this.custName = custName;
        this.pickUpLoaction = pickUpLoaction;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPickUpLoaction() {
        return pickUpLoaction;
    }

    public void setPickUpLoaction(String pickUpLoaction) {
        this.pickUpLoaction = pickUpLoaction;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
