package com.sliit.mtit.microservice.Deliverservice.controller.dto;

public class DeliverRequest {

    private String deliverPlace;
    private String deliverCost;
    private String deliverCustomerName;

    public String getDeliverPlace() {
        return deliverPlace;
    }

    public void setDeliverPlace(String deliverPlace) {
        this.deliverPlace = deliverPlace;
    }

    public String getDeliverCost() {
        return deliverCost;
    }

    public void setDeliverCost(String deliverCost) {
        this.deliverCost = deliverCost;
    }


    public String getDeliverCustomerName() {
        return deliverCustomerName;
    }

    public void setDeliverCustomerName(String deliverCustomerName) {
        this.deliverCustomerName = deliverCustomerName;
    }

    @Override
    public String toString() {
        return "DeliverRequest{" +
                "deliverPlace='" + deliverPlace + '\'' +
                ", deliverCost='" + deliverCost + '\'' +
                ", deliverCustomerName='" + deliverCustomerName + '\'' +
                '}';
    }
}
