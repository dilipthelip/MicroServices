package com.customerService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.customerService.domain.Customer;
import com.customerService.repository.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
	  @Bean
	  CommandLineRunner init(CustomerRepository repo) {
	  return (evt) ->  {
	    repo.save(new Customer("Adam","adam@boot.com"));
	    repo.save(new Customer("John","john@boot.com"));
	  repo.save(new Customer("Smith","smith@boot.com"));
	    repo.save(new Customer("Edgar","edgar@boot.com"));
	    repo.save(new Customer("Martin","martin@boot.com"));
	    repo.save(new Customer("Tom","tom@boot.com"));
	    repo.save(new Customer("Sean","sean@boot.com"));
	    repo.save(new Customer("jhj","sean@boot.com"));
	  };
	  }
}
