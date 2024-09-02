package no.kjetil.data_joke.client;

import org.springframework.web.service.annotation.GetExchange;
import no.kjetil.data_joke.model.DadJokeResponse;
import reactor.core.publisher.Mono;

public interface DadJokeClient {
    @GetExchange("/")
    Mono<DadJokeResponse> getRandomDadJoke();
}

