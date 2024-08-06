package com.example.schedulerapp.controller;

import com.example.schedulerapp.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    public void updateCards(){
        cardService.updateCards();
    }
}
