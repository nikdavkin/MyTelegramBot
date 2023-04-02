package ru.tinkoff.edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public class HelpCommand extends BasicCommand {

    @Override
    public String command() {
        return Commands.help.getCommand();
    }

    @Override
    public String description() {
        return Commands.help.getMessage();
    }

    @Override
    public SendMessage handle(Update update) {
        return send(update, "All commands currently available");
    }

    @Override
    public boolean supports(Update update) {
        return update.message().text().startsWith("/help");
    }
}
