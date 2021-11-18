/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.graphql.repository;

import com.sky.graphql.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Yasen Shaik
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
