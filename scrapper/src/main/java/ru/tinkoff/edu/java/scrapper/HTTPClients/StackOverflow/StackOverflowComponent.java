package ru.tinkoff.edu.java.scrapper.HTTPClients.StackOverflow;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
public class StackOverflowComponent {
    private final StackOverflowClient stackOverflowClient;

    public Mono<StackOverflowResponse> getQuestion(int id) {
        return stackOverflowClient.getQuestion(id);
    }
}
