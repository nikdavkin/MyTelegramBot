package ru.tinkoff.edu.java.scrapper.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
public class LinkUpdateScheduler {
    @Scheduled(fixedDelayString = "#{@scheduler}")
    public void update() {
        log.info("Hello world");
    }
}
