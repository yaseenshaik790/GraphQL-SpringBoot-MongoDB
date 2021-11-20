/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.customer.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sky.customer.model.Customer;
import com.sky.customer.response.CustomerResponse;
import com.sky.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author shayasee
 */
@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private CustomerService customerService;

//    public String saveCustomer(CustomerRequest customerRequest) {
//        String message = customerService.saveCustomer(customerRequest);
//        return message;
//    }
    public CustomerResponse getCustomer(Integer customerId) {
        Customer customer = customerService.getCustomer(customerId);
        return new CustomerResponse(customer);
    }
}
