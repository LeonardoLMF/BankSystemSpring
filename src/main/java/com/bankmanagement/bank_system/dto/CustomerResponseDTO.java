package com.bankmanagement.bank_system.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class CustomerResponseDTO {


    private String id;
    private String fullName;
    private String email;
    private LocalDateTime createdAt;

}
