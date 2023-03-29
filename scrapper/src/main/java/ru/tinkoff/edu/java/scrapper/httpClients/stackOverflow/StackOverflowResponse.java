package ru.tinkoff.edu.java.scrapper.httpClients.stackOverflow;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public record StackOverflowResponse(
        @JsonProperty("title")
        String question,
        @JsonProperty("is_answered")
        Boolean isAnswered,
        @JsonProperty("last_activity_date")
        OffsetDateTime lastActivityDate

) {
}
