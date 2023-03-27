package ru.tinkoff.edu.java.scrapper.HTTPClients.GitHub;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import reactor.core.publisher.Mono;

public interface GitHubClient {
    @GetExchange("/repos/{owner}/{repo}")
    Mono<GitHubResponse> getRepo(@PathVariable("owner") String owner,
                                 @PathVariable("repo") String repo);
}
