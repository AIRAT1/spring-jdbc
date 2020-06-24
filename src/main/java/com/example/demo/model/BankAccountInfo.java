package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BankAccountInfo {
    private Long id;
    private String fullName;
    private double balance;
}
