package ru.tinkoff.edu.java.bot.dto.scrapper.responses;

import java.util.List;

public record ListLinksResponse(List<LinkResponse> links, Integer size) {
}
