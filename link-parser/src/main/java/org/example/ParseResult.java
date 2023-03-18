package org.example;

public sealed class ParseResult permits GitHubParser,StackOverflowParser {
    ParseResult parse(String URL) {
        return this;
    }
}
