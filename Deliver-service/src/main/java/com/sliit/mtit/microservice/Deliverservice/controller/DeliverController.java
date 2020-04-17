package com.sliit.mtit.microservice.Deliverservice.controller;

import com.sliit.mtit.microservice.Deliverservice.controller.dto.DeliverRequest;
import com.sliit.mtit.microservice.Deliverservice.controller.dto.DeliverResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/deliver")
public class DeliverController {
    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody DeliverResponse createDeliver(@RequestBody DeliverRequest deliverrequest){

        System.out.println("Order details :"+ deliverrequest);
        var deliverResponse = new DeliverResponse();
        deliverResponse.setDeliverId(UUID.randomUUID().toString());
        deliverResponse.setMessage("Successfull create the order");
        return deliverResponse;

    }
}
