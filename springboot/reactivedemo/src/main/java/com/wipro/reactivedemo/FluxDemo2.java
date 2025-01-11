package com.wipro.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxDemo2 {

	public static void main(String[] args) throws IOException {
		
		Flux<String> stringFlux = Flux.just("Apple", "Banana", "Orange", "Mango").delayElements(Duration.ofSeconds(1));
		
		stringFlux.subscribe(f->System.out.println(f));

        System.out.println("next line executing");
		
		System.out.println("Press a key to end");
	    System.in.read();	

	}

}
