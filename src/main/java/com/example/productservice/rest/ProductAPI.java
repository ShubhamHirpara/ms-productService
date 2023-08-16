package com.example.productservice.rest;

import com.example.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")
public class ProductAPI {

    @Autowired
    ProductService productService;

    @GetMapping("/get")
    public String getProduct(){
        return productService.getProductwithCustomerName();
    }

}
