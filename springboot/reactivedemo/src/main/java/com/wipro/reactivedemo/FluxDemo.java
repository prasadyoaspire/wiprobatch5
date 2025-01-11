package com.wipro.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Main Starts...");
		
		Flux<Integer> numFlux = Flux.range(1, 10).delayElements(Duration.ofSeconds(3));
		numFlux.subscribe(n->System.out.println(n));
				
		System.out.println("next line executing");
		
		System.out.println("Press a key to end");
	    System.in.read();		
		
		System.out.println("Main Ends...");
		
	}

}
