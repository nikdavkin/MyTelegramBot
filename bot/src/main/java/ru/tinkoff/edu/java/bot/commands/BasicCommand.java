package ru.tinkoff.edu.java.bot.commands;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public abstract class BasicCommand implements Command{
    protected SendMessage send(Update update, String message) {
        return new SendMessage(update.message().chat().id(), message);
    }
}
