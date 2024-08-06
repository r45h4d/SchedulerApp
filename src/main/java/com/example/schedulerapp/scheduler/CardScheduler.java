package com.example.schedulerapp.scheduler;

import com.example.schedulerapp.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CardScheduler {
    private final CardService cardService;

    @Scheduled(cron="0 0 3 * * *")
    @SchedulerLock(name="updateCards", lockAtLeastForString = "PT5M", lockAtMostForString = "PT5H")
    public void updateCards(){
        cardService.updateCards();
    }
}
