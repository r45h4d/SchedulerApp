package com.example.schedulerapp.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cards")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Column(name = "card_number", nullable = false, unique = true, length = 16)
    private String cardNumber;

    //@Column(name = "card_holder_name", nullable = false, length = 100)
    private String cardHolderName;

    //@Column(name = "expiration_date", nullable = false)
    private LocalDate expirationDate;

    //@Column(name = "card_type", nullable = false, length = 20)
    private String cardType;

    //@Column(name = "issued_date", nullable = false)
    private LocalDate issuedDate;

    //@Column(name = "amount", nullable = false, precision = 19, scale = 4)
    private BigDecimal amount;
}
