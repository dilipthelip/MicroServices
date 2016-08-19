/**
 * 
 */
package com.customerService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.customerService.domain.Customer;

/**
 * @author Z001QGD
 *
 */
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	 Optional<Customer> findByName(@Param("name") String name);

}
