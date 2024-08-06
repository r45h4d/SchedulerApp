package com.example.schedulerapp.service.concrete;

import com.example.schedulerapp.dao.repository.CardRepository;
import com.example.schedulerapp.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CardServiceHandler implements CardService {
    private final CardRepository cardRepository;
    @Override
    public void updateCards() {
        var cards = cardRepository.findAll();
        cards.forEach(it->it.setAmount(it.getAmount().add(it.getAmount().multiply(new BigDecimal("0.05")))));
        cardRepository.saveAll(cards);
    }
}
