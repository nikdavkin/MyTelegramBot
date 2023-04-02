package ru.tinkoff.edu.java.bot.commands;

public enum Commands {
    start("/start", "register a user"),
    help("/help", "display the command window"),
    track("/track", "start tracking the link"),
    untrack("/untrack", "stop tracking the link"),
    list("/list", "show the list of tracked links");

    private final String command;
    private final String message;

    Commands(String command, String message) {
        this.command = command;
        this.message = message;
    }

    public String getCommand() {
        return command;
    }

    public String getMessage() {
        return message;
    }
}
