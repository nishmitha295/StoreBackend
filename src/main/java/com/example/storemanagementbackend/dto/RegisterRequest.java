package com.example.storemanagementbackend.dto;

import com.example.storemanagementbackend.entity.UserRole;
import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
    private String fullName;
    private String email;
    private UserRole role;
} 