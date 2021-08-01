package com.inqoo.trainingservice.app.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    Optional<Customer> findByEmailAddress(String emailAddress);

}
