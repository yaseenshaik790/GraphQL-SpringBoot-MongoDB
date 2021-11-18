/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.graphql.service;

import com.sky.graphql.model.Employee;
import com.sky.graphql.repository.EmployeeRepository;
import com.sky.graphql.request.EmployeeRequest;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yasen Shaik
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee getEmployeeById(String empId) {
        Optional<Employee> empOptional = repository.findById(empId);
        if (empOptional.isPresent()) {
            return empOptional.get();
        } else {
            return new Employee();
        }
    }

    public Employee saveEmployee(EmployeeRequest request) {
        Employee employee = new Employee(request.getEmpId(), request.getEmpName(),request.getPhoneNo());
        return repository.save(employee);
    }

}
