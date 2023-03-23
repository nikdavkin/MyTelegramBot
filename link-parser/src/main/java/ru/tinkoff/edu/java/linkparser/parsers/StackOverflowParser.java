package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.results.StackOverflowResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StackOverflowParser implements Parser {
    private static final Pattern pattern = Pattern.compile("^https://stackoverflow[.]com/questions/(\\d+)/\\S+$");

    @Override
    public StackOverflowResult parse(String URL) {
        Matcher match = pattern.matcher(URL);
        if (!match.matches()) return null;
        Long id = Long.valueOf(match.group(1));
        return new StackOverflowResult(id);
    }
}
