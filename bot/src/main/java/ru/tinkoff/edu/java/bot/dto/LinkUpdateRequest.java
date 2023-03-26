package ru.tinkoff.edu.java.bot.dto;

import java.util.List;

public record LinkUpdateRequest(
        Long id,
        String url,
        String description,
        List<Integer> thChatIds) {
}
