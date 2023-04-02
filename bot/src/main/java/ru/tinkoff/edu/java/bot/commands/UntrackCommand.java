package ru.tinkoff.edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.RequiredArgsConstructor;
import ru.tinkoff.edu.java.bot.controller.LinksController;
import ru.tinkoff.edu.java.bot.dto.scrapper.requests.RemoveLinkRequest;
import ru.tinkoff.edu.java.bot.dto.scrapper.responses.LinkResponse;

@RequiredArgsConstructor
public class UntrackCommand extends BasicCommand {
    private final LinksController linksController;

    @Override
    public String command() {
        return Commands.untrack.getCommand();
    }

    @Override
    public String description() {
        return Commands.untrack.getMessage();
    }

    @Override
    public SendMessage handle(Update update) {
        LinkResponse linkResponse = linksController.removeTrackOnLink(update.message().chat().id(), new RemoveLinkRequest(update.message().text()));
        return send(update, linkResponse.toString());
    }

    @Override
    public boolean supports(Update update) {
        return update.message().text().startsWith("/untrack");
    }
}
