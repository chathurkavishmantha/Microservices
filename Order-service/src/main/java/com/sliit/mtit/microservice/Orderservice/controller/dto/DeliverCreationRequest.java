package com.sliit.mtit.microservice.Orderservice.controller.dto;

public class DeliverCreationRequest {

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
}
