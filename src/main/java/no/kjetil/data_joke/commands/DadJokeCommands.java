package no.kjetil.data_joke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import no.kjetil.data_joke.client.DadJokeClient;

@ShellComponent
public class DadJokeCommands {

    private final DadJokeClient dadJokeClient;

    DadJokeCommands(DadJokeClient dadJokeClient) {
        this.dadJokeClient = dadJokeClient;
    }
    
    @ShellMethod(key = "dad-joke", value = "I will tell you a random dad joke.")
    public String getRandomDadJoke() {
        return dadJokeClient.getRandomDadJoke().block().joke();
    }
}
