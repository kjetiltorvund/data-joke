package no.kjetil.data_joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import no.kjetil.data_joke.client.DadJokeClient;

@SpringBootApplication
public class DataJokeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataJokeApplication.class, args);
	}

	@Bean
	public DadJokeClient dadJokeClient() {
		WebClient client = WebClient.builder()
		.baseUrl("https://icanhazdadjoke.com")
		.defaultHeader("Accept", "application/json")
		.build();

		HttpServiceProxyFactory factory =  HttpServiceProxyFactory.builderFor(WebClientAdapter.create(client)).build();

		return factory.createClient(DadJokeClient.class);
	}

}
