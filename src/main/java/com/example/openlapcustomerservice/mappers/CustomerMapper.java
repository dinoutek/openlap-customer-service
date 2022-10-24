package com.example.openlapcustomerservice.mappers;


import com.example.openlapcustomerservice.dto.CustomerRequestDTO;
import com.example.openlapcustomerservice.dto.CustomerResponseDTO;
import com.example.openlapcustomerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerResponseDTO customerToCustomerDTO(Customer customer);
    Customer customerRequestDtoToCustomer(CustomerRequestDTO customerRequestDTO);
}
