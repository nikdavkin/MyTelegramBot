package ru.tinkoff.edu.java.linkparser.parsers;

import ru.tinkoff.edu.java.linkparser.results.GitHubResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GitHubParser implements Parser {
    private static final Pattern pattern = Pattern.compile("^https://github[.]com/(\\S+)/(\\S+)/$");

    @Override
    public GitHubResult parse(String URL) {
        Matcher match = pattern.matcher(URL);
        if (!match.matches()) return null;
        String user = match.group(1);
        String repo = match.group(2);
        return new GitHubResult(user, repo);
    }
}
