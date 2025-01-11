package com.wipro.reactiveweb2;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Mono;

@Component
public class MyHandler {

	public Mono<String> getHelloMessage() {
        return Mono.just("Hello from WebFlux!");
    }
 
    public Mono<String> getCustomMessage(String name) {
        return Mono.just("Hello, " + name + "!");
    }
    public Mono<String> postMessage(String message) {
        return Mono.just("Message received: " + message);
    }
}
