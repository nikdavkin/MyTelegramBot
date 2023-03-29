package ru.tinkoff.edu.java.scrapper.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.tinkoff.edu.java.scrapper.httpClients.gitHub.GitHubClient;
import ru.tinkoff.edu.java.scrapper.httpClients.stackOverflow.StackOverflowClient;

@Configuration
public class ClientConfiguration {
    @Bean
    public GitHubClient gitHubClient() {
       return new GitHubClient();
    }

    @Bean
    public StackOverflowClient StackOverflowClient() {
       return new StackOverflowClient();
    }

    @Bean
    public java.time.Duration scheduler(ApplicationConfig cfg){
        return cfg.scheduler().getInterval();
    }
}
