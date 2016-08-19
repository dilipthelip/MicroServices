package com.customerService.businesslogic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customerService.domain.Customer;
import com.customerService.repository.CustomerRepository;

@Component
public class CustomerRegistrar {
	
	@Autowired
	 CustomerRepository customerRespository;
	/**
	 * 
	 * @param customer
	 * @return
	 */
	Customer register(Customer customer){
	    Optional<Customer> existingCustomer = customerRespository.findByName(customer.getName());
	    if (existingCustomer.isPresent()){
	      throw new RuntimeException("is already exists");
	    } else {
	      customerRespository.save(customer); 
	    }
	    return customer;
	  }
}
