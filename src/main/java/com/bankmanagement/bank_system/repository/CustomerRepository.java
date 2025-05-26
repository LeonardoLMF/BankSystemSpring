package com.bankmanagement.bank_system.repository;

import com.bankmanagement.bank_system.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // find customer email by id
    Optional<Customer> findByEmail (String email);

    // checks if email exists
    boolean existsByEmail(String email);

}
