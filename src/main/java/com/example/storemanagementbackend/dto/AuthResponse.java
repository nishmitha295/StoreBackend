package com.example.storemanagementbackend.dto;

import com.example.storemanagementbackend.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private String token;
    private String username;
    private UserRole role;
    private String fullName;
} 