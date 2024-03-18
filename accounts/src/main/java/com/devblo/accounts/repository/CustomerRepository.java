package com.devblo.accounts.repository;

import com.devblo.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// Created by blisahn 03/04/2024
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * @param mobileNumber
     * @return an optional depending on result
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
