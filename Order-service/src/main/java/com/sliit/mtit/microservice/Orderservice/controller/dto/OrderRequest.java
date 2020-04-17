package com.sliit.mtit.microservice.Orderservice.controller.dto;

public class OrderRequest {

    private String orderPlace;
    private String orderCost;
    private String orderType;
    private String orderCustomerName;

    public String getOrderPlace() {
        return orderPlace;
    }

    public void setOrderPlace(String fullname) {
        this.orderPlace = fullname;
    }

    public String getOrderCost() {
        return orderCost;
    }

    public void setOrderCost(String age) {
        this.orderCost = age;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderCustomerName() {
        return orderCustomerName;
    }

    public void setOrderCustomerName(String orderDetails) {
        this.orderCustomerName = orderDetails;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "OrderPlace='" + orderPlace + '\'' +
                ", OrderCost='" + orderCost + '\'' +
                ", OrderType='" + orderType + '\'' +
                ", OrderCustomerName='" + orderCustomerName + '\'' +
                '}';
    }
}
