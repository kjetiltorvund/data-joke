package no.kjetil.data_joke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommands {

    @ShellMethod(key = "hello", value = "I will say hello to you.")
    public String hello(@ShellOption(defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }

    @ShellMethod(key = "goodbye", value = "I will say goodbye to you.")
    public String goodbye(@ShellOption(defaultValue = "World") String name) {
        return String.format("Goodbye, %s!", name);
    }
}
