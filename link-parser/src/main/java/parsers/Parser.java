package parsers;

import org.example.results.ParseResult;

interface Parser {
    ParseResult parse(String URL);
}
