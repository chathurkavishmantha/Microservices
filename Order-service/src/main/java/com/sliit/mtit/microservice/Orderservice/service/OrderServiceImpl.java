package com.sliit.mtit.microservice.Orderservice.service;

import com.sliit.mtit.microservice.Deliverservice.controller.dto.DeliverResponse;
import com.sliit.mtit.microservice.Orderservice.controller.dto.DeliverCreationRequest;
import com.sliit.mtit.microservice.Orderservice.controller.dto.DeliverCreationResponse;
import com.sliit.mtit.microservice.Orderservice.controller.dto.OderResponse;
import com.sliit.mtit.microservice.Orderservice.controller.dto.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImpl {
    @Autowired
    private RestTemplate restTemplate;

    public OderResponse createOrder(OrderRequest orderRequest){

        var deliverCreationRequest = new DeliverCreationRequest();
        deliverCreationRequest.setDeliverPlace(orderRequest.getOrderPlace());
        deliverCreationRequest.setDeliverCustomerName(orderRequest.getOrderCustomerName());
        deliverCreationRequest.setDeliverCost(orderRequest.getOrderCost());
        ResponseEntity<DeliverResponse> deliverCreationResponse = restTemplate.postForEntity("http://localhost:8080/deliver",deliverCreationRequest,DeliverResponse.class);

        var orderResponse = new OderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setDeliverId(deliverCreationResponse.getBody().getDeliverId());
        orderResponse.setMessage("Successfull create the order");

        return orderResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
