package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.results.GitHubResult;
import ru.tinkoff.edu.java.linkparser.results.ParseResult;
import ru.tinkoff.edu.java.linkparser.results.StackOverflowResult;

import java.util.List;
import java.util.Objects;

public class LinkParser {
    static final List<Parser> parsers = List.of(new GitHubParser(), new StackOverflowParser());

    public static ParseResult mainParse(String URL) {
        return parsers.stream().map(p -> p.parse(URL)).filter(Objects::nonNull).findAny().orElse(null);
    }

    public static void main(String[] args) {
        String URL = "https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c";
        ParseResult result = mainParse(URL);
        if (result instanceof GitHubResult ghr)
            System.out.println("GitHub result\nUser: " + ghr.user() + "\nRepo:" + ghr.repo());
        else if (result instanceof StackOverflowResult sor) System.out.println("StackOverflow result\nID:" + sor.id());
        else System.out.println("Wrong URL");
    }
}
