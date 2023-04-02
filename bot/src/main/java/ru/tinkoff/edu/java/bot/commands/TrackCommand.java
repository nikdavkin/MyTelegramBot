package ru.tinkoff.edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.RequiredArgsConstructor;
import ru.tinkoff.edu.java.bot.controller.LinksController;
import ru.tinkoff.edu.java.bot.dto.scrapper.requests.AddLinkRequest;
import ru.tinkoff.edu.java.bot.dto.scrapper.responses.LinkResponse;

@RequiredArgsConstructor
public class TrackCommand extends BasicCommand {
    private final LinksController linksController;

    @Override
    public String command() {
        return Commands.track.getCommand();
    }

    @Override
    public String description() {
        return Commands.track.getMessage();
    }

    @Override
    public SendMessage handle(Update update) {
        LinkResponse linkResponse = linksController.addTrackOnLink(update.message().chat().id(), new AddLinkRequest(update.message().text()));
        return send(update, linkResponse.toString());
    }

    @Override
    public boolean supports(Update update) {
        return update.message().text().startsWith("/track");
    }
}
