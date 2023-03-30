package ru.tinkoff.edu.java.scrapper.httpClients.stackOverflow;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class StackOverflowClient {
    private final WebClient webClient;
    private static final String STACKOVERFLOW_URL = "https://stackoverflow.com";

    public StackOverflowClient() {
        this(STACKOVERFLOW_URL);
    }

    public StackOverflowClient(String URL) {
        webClient = WebClient.create(URL);
    }

    public StackOverflowResponse getQuestion(int id) {
        return webClient.get().uri("/questions/{id}?site=stackoverflow", id).retrieve().bodyToMono(StackOverflowResponse.class).block();
    }
}
