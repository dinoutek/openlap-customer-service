package com.example.openlapcustomerservice;

import com.example.openlapcustomerservice.entities.CustomerRepository.CustomerRepository;
import com.example.openlapcustomerservice.entities.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OpenlapCustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenlapCustomerServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer("001","Adria","med@adria.com"));
            customerRepository.save(new Customer("002","LinkedIn","linked@adria.com"));
        };
    }
}
