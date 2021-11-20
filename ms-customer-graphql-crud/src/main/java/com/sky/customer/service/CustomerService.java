/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.customer.service;

import com.sky.customer.model.Address;
import com.sky.customer.model.Customer;
import com.sky.customer.repository.CustomerRepository;
import com.sky.customer.request.AddressData;
import com.sky.customer.request.CustomerRequest;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author shayasee
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(CustomerRequest customerRequest) {
        Customer customer = Customer.builder()
                .custId(customerRequest.getCustId())
                .custName(customerRequest.getCustName())
                .build();
        if (customerRequest.getAddressDatas() != null) {
            List<Address> addresses = customerRequest.getAddressDatas().stream().map((AddressData ad) -> {
                Address a = new Address(ad.getHouseNo(), ad.getCity(), ad.getState(), ad.getPincode());
                return a;
            }).collect(Collectors.toList());
            customer.setAddress(addresses);
        }
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Integer customerId) {
        Optional<Customer> optional = customerRepository.findById(customerId);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            return new Customer();
        }
    }
}
