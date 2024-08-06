package com.example.schedulerapp.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddOrUpdateCardRequest {
    private String cardNumber;
    private String cardHolderName;
    private LocalDate expirationDate;
    private String cardType;
    private LocalDate issuedDate;
    private BigDecimal amount;
}
