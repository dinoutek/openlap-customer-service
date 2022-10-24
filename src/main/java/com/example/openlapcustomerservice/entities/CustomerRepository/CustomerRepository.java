package com.example.openlapcustomerservice.entities.CustomerRepository;


import com.example.openlapcustomerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
