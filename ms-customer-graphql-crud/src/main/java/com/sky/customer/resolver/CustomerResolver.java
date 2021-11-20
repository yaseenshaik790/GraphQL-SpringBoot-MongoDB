/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.customer.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.sky.customer.model.Address;
import com.sky.customer.response.CustomerResponse;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author shayasee
 */
@Service
public class CustomerResolver implements GraphQLResolver<CustomerResponse> {

    public List<Address> getAddresses(CustomerResponse response, String state) {
        if (response != null) {
            return response.getAddresses().stream()
                    .filter(a -> a.getState().equals(state)).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }
}
