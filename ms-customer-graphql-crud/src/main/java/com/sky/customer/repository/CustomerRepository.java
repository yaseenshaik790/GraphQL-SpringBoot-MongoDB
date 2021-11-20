/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.customer.repository;

import com.sky.customer.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author shayasee
 */
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
    
}
