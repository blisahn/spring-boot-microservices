package com.devblo.accounts.mapper;

import com.devblo.accounts.dto.CustomerDto;
import com.devblo.accounts.entity.Customer;

/**
 * @author blisahn 06.03.2024
 */
public class CustomerMapper {

    public static CustomerDto maptoCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static Customer maptoCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }
}
