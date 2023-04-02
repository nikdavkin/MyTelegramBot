package ru.tinkoff.edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.tinkoff.edu.java.bot.controller.TgChatController;

@Component
@RequiredArgsConstructor
public class StartCommand extends BasicCommand {
    private final TgChatController tgChatController;

    @Override
    public String command() {
        return Commands.start.getCommand();
    }

    @Override
    public String description() {
        return Commands.start.getMessage();
    }

    @Override
    public SendMessage handle(Update update) {
        tgChatController.registerChat(update.message().chat().id());
        return send(update, "User is registered!");
    }

    @Override
    public boolean supports(Update update) {
        return update.message().text().startsWith("/start");
    }
}
