package com.CustumerProject.CustumerProject.repositories;

import java.util.List;

import com.CustumerProject.CustumerProject.models.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <Customer, Long>{
    
    List<Customer> findByLastName(String Name);

    Customer findById(long id);
        
}
