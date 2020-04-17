package com.sliit.mtit.microservice.Orderservice.controller;

import com.sliit.mtit.microservice.Orderservice.controller.dto.OderResponse;
import com.sliit.mtit.microservice.Orderservice.controller.dto.OrderRequest;
import com.sliit.mtit.microservice.Orderservice.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody OderResponse createOder(@RequestBody OrderRequest request){

        System.out.println("Order details :"+request);

        return orderService.createOrder(request);

    }
}
