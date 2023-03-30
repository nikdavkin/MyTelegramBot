package ru.tinkoff.edu.java.scrapper.dto.responses;

import java.util.List;

public record ListLinksResponse(List<LinkResponse> links, Integer size) {
}
