package com.sliit.mtit.microservice.Deliverservice.controller.dto;

public class DeliverResponse {

    private String deliverId;
    private String message;

    public String getDeliverId() {
        return deliverId;
    }

    public void setDeliverId(String deliverId) {
        this.deliverId = deliverId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
