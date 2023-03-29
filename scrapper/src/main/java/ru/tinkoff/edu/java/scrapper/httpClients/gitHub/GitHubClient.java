package ru.tinkoff.edu.java.scrapper.httpClients.gitHub;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class GitHubClient {
    private final WebClient webClient;
    private static final String GITHUB_URL = "https://api.github.com";

    public GitHubClient(String URL) {
        this.webClient = WebClient.create(URL);
    }

    public GitHubClient() {

        this(GITHUB_URL);
    }

    public GitHubResponse getRepo(String owner, String repo) {
        return webClient.get().uri("/repos/{user}/{repo}", owner, repo).retrieve().bodyToMono(GitHubResponse.class).block();
    }
}
