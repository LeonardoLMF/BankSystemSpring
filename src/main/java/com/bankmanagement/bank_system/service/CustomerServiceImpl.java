package com.bankmanagement.bank_system.service;

import com.bankmanagement.bank_system.model.Customer;
import com.bankmanagement.bank_system.repository.CustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer){
        if (customerRepository.existsByEmail(customer.getEmail())){
            throw new IllegalArgumentException("Email already registered");
        }
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers(Customer customer){
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id){
        return customerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Customer not found with id: " + id));
    }
}
