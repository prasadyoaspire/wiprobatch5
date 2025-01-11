package com.wipro.reactiveweb2;

import java.time.Duration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {
	
	/**
	 * Serves a Plain text
	 */

	public Mono<ServerResponse> monoMessageHandler() {
	
		return ServerResponse.ok()
				.contentType(MediaType.TEXT_PLAIN)
				.body(Mono.just("Hello Mono Message Handler"),String.class);
	}

	/**
	 * Serves a JSON stream
	 */
	public Mono<ServerResponse> fluxMessage() {
		
		return ServerResponse.ok()
				.contentType(MediaType.APPLICATION_STREAM_JSON)
				.body(Flux.just("Welcome ", "to ", "Wipro TechWorld").delayElements(Duration.ofSeconds(1)),String.class);
	}
}
