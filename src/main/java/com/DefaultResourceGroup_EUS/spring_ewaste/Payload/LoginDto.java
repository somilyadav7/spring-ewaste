package com.DefaultResourceGroup_EUS.spring_ewaste.Payload;

import lombok.Data;

@Data
public class LoginDto {
    private String usernameOrEmail;
    private String password;
}
