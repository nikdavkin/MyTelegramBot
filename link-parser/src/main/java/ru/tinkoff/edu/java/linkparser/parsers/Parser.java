package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.results.ParseResult;

public interface Parser {
    ParseResult parse(String URL);
}
