package ru.tinkoff.edu.java.bot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.tinkoff.edu.java.bot.dto.LinkUpdateRequest;

@RestController
public class BotController {

    @PostMapping(path = "/updates", produces = "application/json")
    public String sendUpdate(@RequestBody LinkUpdateRequest linkUpdateRequest) {
        return null;
    }
}
