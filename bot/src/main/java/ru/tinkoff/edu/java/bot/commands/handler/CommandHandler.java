package ru.tinkoff.edu.java.bot.commands.handler;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.RequiredArgsConstructor;
import ru.tinkoff.edu.java.bot.commands.*;
import ru.tinkoff.edu.java.bot.controller.LinksController;
import ru.tinkoff.edu.java.bot.controller.TgChatController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class CommandHandler {
    private final List<BasicCommand> basicCommandList = List.of(new HelpCommand(),
            new ListCommand(new LinksController()),
            new StartCommand(new TgChatController()),
            new UntrackCommand(new LinksController()),
            new TrackCommand(new LinksController()));

    public SendMessage handle(Update update) {
        Optional<BasicCommand> command = basicCommandList.stream().filter(com -> com.supports(update)).findAny();
        return command.isPresent() ? command.get().handle(update)
                : new SendMessage(update.message().chat().id(), "Sorry! Unknown command!");
    }
}
