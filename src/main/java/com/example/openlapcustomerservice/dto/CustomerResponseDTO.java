package com.example.openlapcustomerservice.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class CustomerResponseDTO {
    private String id;
    private String name;
    private String email;
}
