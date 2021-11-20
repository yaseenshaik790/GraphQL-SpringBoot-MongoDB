/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sky.customer.response;

import com.sky.customer.model.Address;
import com.sky.customer.model.Customer;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author shayasee
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResponse {

    private Integer custId;
    private String custName;
    private List<Address> addresses;

    public CustomerResponse(Customer customer) {
        this.addresses = customer.getAddress();
        this.custId = customer.getCustId();
        this.custName = customer.getCustName();
    }

}
