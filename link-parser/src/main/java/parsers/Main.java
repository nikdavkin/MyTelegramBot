package parsers;

import org.example.results.GitHubResult;
import org.example.results.ParseResult;
import org.example.results.StackOverflowResult;

import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Parser> parsers = List.of(new GitHubParser(), new StackOverflowParser());
        String URL = "https://stackoverflow.com/questions/1642028/what-is-the-operator-in-c";
        ParseResult result = parsers.stream().map(p -> p.parse(URL)).filter(Objects::nonNull).findAny().orElse(null);
        if (result instanceof GitHubResult ghr)
            System.out.println("GitHub result\nUser: " + ghr.user() + "\nRepo:" + ghr.repo());
        else if (result instanceof StackOverflowResult sor) System.out.println("StackOverflow result\nID:" + sor.id());
        else System.out.println("Wrong URL");
    }
}
