package ru.tinkoff.edu.java.scrapper.HTTPClients.GitHub;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class GitHubComponent {
    private final GitHubClient gitHubClient;

    public Mono<GitHubResponse> getRepo(String owner, String repo) {
        return gitHubClient.getRepo(owner, repo);
    }
}
