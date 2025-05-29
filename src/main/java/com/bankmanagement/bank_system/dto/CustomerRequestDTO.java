package com.bankmanagement.bank_system.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequestDTO {

    @NotBlank(message = "Full name is required")
    private String fullName;

    @NotBlank(message = "Email should be valid")
    @Email(message = "Email is required")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;

}
