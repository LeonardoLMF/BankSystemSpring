package com.bankmanagement.bank_system.service;


import com.bankmanagement.bank_system.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer createCustomer(Customer customer);

    List<Customer> getAllCustomers(Customer customer);

}
