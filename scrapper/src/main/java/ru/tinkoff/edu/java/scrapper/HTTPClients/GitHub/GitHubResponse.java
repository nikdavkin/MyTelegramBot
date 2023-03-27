package ru.tinkoff.edu.java.scrapper.HTTPClients.GitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public record GitHubResponse(
        @JsonProperty("full_name")
        String name,
        @JsonProperty("updated_at")
        OffsetDateTime updateTime
) {

}
