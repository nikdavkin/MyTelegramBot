package ru.tinkoff.edu.java.scrapper.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tg-chat")
public class TgChatController {

    @PostMapping(path = "/{id}", produces = "application/json")
    public String registerChat(@PathVariable Long id) {
        return null;
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public String deleteChat(@PathVariable Long id) {
        return null;
    }
}
