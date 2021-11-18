/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Yasen Shaik
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("Employee")
public class Employee {

    @Id
    private String empId;
    private String empName;
    private Long phoneNo;
}
