/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.customer.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.sky.customer.request.CustomerRequest;
import com.sky.customer.response.CustomerResponse;
import com.sky.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author shayasee
 */
@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private CustomerService customerService;

    public CustomerResponse createCustomer(CustomerRequest request) {
        return new CustomerResponse(customerService.saveCustomer(request));
    }
}
