package ru.tinkoff.edu.java.scrapper.configuration;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.annotation.Validated;
import ru.tinkoff.edu.java.scrapper.HTTPClients.GitHub.GitHubClient;

import java.time.Duration;

@Validated
@Getter
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@Configuration
@EnableScheduling
public class ApplicationConfig {
    @NotNull
    private String test;
    @NotNull
    private GitHub gh;
    @NotNull
    private StackOverflow so;
    @NotNull
    private Scheduler scheduler;

    @Getter
    public static class GitHub {
        @NotNull
        private final String url = "https://api.github.com";
    }

    @Getter
    public static class StackOverflow {
        @NotNull
        private final String url = "https://stackoverflow.com";
    }

    @Getter
    public record Scheduler(Duration interval) {
    }

}
