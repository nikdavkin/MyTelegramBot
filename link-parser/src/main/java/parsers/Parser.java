package parsers;

import org.example.results.ParseResult;

public interface Parser {
    ParseResult parse(String URL);
}
