package ru.tinkoff.edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.RequiredArgsConstructor;
import ru.tinkoff.edu.java.bot.controller.LinksController;
import ru.tinkoff.edu.java.bot.dto.scrapper.responses.ListLinksResponse;

@RequiredArgsConstructor
public class ListCommand extends BasicCommand {
    private final LinksController linksController;

    @Override
    public String command() {
        return Commands.list.getCommand();
    }

    @Override
    public String description() {
        return Commands.list.getMessage();
    }

    @Override
    public SendMessage handle(Update update) {
        ListLinksResponse response = linksController.getTrackedLinks(update.message().chat().id());
        if (response.size() == 0) return send(update, "Error! No links");
        return send(update, response.toString());
    }

    @Override
    public boolean supports(Update update) {
        return update.message().text().startsWith("/list");
    }
}
