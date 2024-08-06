package com.example.schedulerapp.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardResponse {
    private Integer id;
    //private String cardNumber;
    private String cardHolderName;
    //private LocalDate expirationDate;
    private String cardType;
    private LocalDate issuedDate;
    //private BigDecimal amount;
}
