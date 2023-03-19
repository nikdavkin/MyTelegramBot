package parsers;

import org.example.results.StackOverflowResult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StackOverflowParser implements Parser {
    @Override
    public StackOverflowResult parse(String URL) {
        String regex = "^https://stackoverflow[.]com/questions/(\\d+)/\\S+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(URL);
        if (!match.matches()) return null;
        Long id = Long.valueOf(match.group(1));
        return new StackOverflowResult(id);
    }
}
