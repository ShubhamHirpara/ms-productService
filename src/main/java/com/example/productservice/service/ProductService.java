package com.example.productservice.service;

import com.example.productservice.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Autowired
    RestTemplate restTemplate;

    public String getProductwithCustomerName(){
        CustomerDTO customerDTO = restTemplate.getForObject("http://localhost:7071/customer/get", CustomerDTO.class);
        return customerDTO.getFirstName()  + " is ordering Coffee";
    }
}
