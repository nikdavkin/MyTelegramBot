package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.results.ParseResult;

import java.util.List;
import java.util.Objects;

public class LinkParser {
    private static final List<Parser> parsers = List.of(new GitHubParser(), new StackOverflowParser());

    public ParseResult mainParse(String URL) {
        return parsers.stream().map(p -> p.parse(URL)).filter(Objects::nonNull).findAny().orElse(null);
    }
}
