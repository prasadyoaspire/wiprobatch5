package com.wipro.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Mono;

public class MonoDemo {

	public static void main(String[] args) throws IOException {
		
		Mono<Integer> intMono = Mono.just(100).delayElement(Duration.ofSeconds(3));
		
		intMono.subscribe(x-> System.out.println(x));
		
		 System.out.println("next line executing");
			
	     System.out.println("Press a key to end");
		 System.in.read();			
	}
}
