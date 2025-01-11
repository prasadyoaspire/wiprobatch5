package com.wipro.reactivedemo;

import java.io.IOException;
import java.time.Duration;

import reactor.core.publisher.Flux;

public class FluxDemo3 {

	public static void main(String[] args) throws IOException {
		
		User user1 = new User(1,"aaa",25);
		User user2 = new User(2,"bbb",25);
		User user3 = new User(3,"ccc",25);
		User user4 = new User(4,"ddd",25);
		
		Flux<User> userFlux = Flux.just(user1,user2,user3,user4).delayElements(Duration.ofSeconds(2));
		userFlux.subscribe(u-> System.out.println(u.getId()+" "+u.getName()+" "+u.getAge()));
		

        System.out.println("next line executing");
		
		System.out.println("Press a key to end");
	    System.in.read();	

	}

}
