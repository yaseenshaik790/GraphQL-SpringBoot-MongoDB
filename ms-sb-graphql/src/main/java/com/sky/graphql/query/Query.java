/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sky.graphql.model.Employee;
import com.sky.graphql.request.EmployeeRequest;
import com.sky.graphql.response.EmployeeResponse;
import com.sky.graphql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Shaik Yaseen
 */
@Component
public class Query implements GraphQLQueryResolver {
    
    @Autowired
    private EmployeeService service;
    
    public String firstQuery() {
        return "GraphQL is amazing";
    }
    
    public String secondQuery() {
        return "GraphQL is extrordinary";
    }
    
    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
    
    public String employee(Employee emp) {
        return emp.getEmpId() + " " + emp.getEmpName();
    }
    
    public EmployeeResponse getEmployeeById(String empId) {
        Employee e = service.getEmployeeById(empId);
        return new EmployeeResponse(e.getEmpId(), e.getEmpName(),e.getPhoneNo());
    }
    
    public EmployeeResponse saveEmployee(EmployeeRequest request) {
        Employee e = service.saveEmployee(request);
        return new EmployeeResponse(e.getEmpId(), e.getEmpName(),e.getPhoneNo());
    }
    
}
