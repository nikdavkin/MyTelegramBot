package org.example.results;

import org.example.results.ParseResult;

public record GitHubResult(String user, String repo) implements ParseResult {
}
