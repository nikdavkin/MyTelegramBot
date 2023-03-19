package parsers;

import org.example.results.GitHubResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GitHubParser implements Parser {
    @Override
    public GitHubResult parse(String URL) {
        String regex = "^https://github[.]com/(\\S+)/(\\S+)/$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(URL);
        if (!match.matches()) return null;
        String user = match.group(1);
        String repo = match.group(2);
        return new GitHubResult(user, repo);
    }
}
