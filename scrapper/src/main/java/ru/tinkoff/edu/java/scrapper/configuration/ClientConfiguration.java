package ru.tinkoff.edu.java.scrapper.configuration;

import org.apache.catalina.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import ru.tinkoff.edu.java.scrapper.HTTPClients.GitHub.GitHubClient;
import ru.tinkoff.edu.java.scrapper.HTTPClients.StackOverflow.StackOverflowClient;

@Configuration
public class ClientConfiguration {
    @Bean
    public GitHubClient gitHubClient(ApplicationConfig cfg) {
        WebClient client = WebClient.create(cfg.getGh().getUrl());
        return client.get()
                .uri("???")//Не понимаю что вставлять
                .retrieve()
                .bodyToMono(GitHubClient.class)
                .block();
    }

    @Bean
    public StackOverflowClient StackOverflowClient(ApplicationConfig cfg) {
        WebClient client = WebClient.create(cfg.getSo().getUrl());
        return client.get()
                .uri("???")//Не понимаю что вставлять
                .retrieve()
                .bodyToMono(StackOverflowClient.class)
                .block();
    }
}
