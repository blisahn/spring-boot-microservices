package com.devblo.accounts.repository;

import com.devblo.accounts.entity.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

// Created by blisahn 03/04/2024
@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    /**
     * @param customerId
     * @return and optional depending on customerId
     */
    Optional<Accounts> findByCustomerId(Long customerId);

    /**
     * @param customerId
     */
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
