package ru.tinkoff.edu.java.scrapper.HTTPClients.StackOverflow;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface StackOverflowClient {
    @GetExchange("/questions/{id}/")
    Mono<StackOverflowResponse> getQuestion(@PathVariable("id") int id);
}
