package com.wipro.reactiveweb2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {
	
	  @Bean
	  RouterFunction<ServerResponse> functionalRoutes(HelloHandler helloHandler) {
	    
		 return RouterFunctions
	      .route(RequestPredicates.GET("/functional/mono"), req -> helloHandler.monoMessageHandler())
	      .andRoute(RequestPredicates.GET("/functional/flux"), req-> helloHandler.fluxMessage());
	     
	  }	 

	  @Bean
	  RouterFunction<ServerResponse> route(MyHandler myHandler) {
	        return RouterFunctions.route()
	            .GET("/hello", req -> ServerResponse.ok().body(myHandler.getHelloMessage(), String.class))
	            .GET("/hello/{name}", req -> {
	                String name = req.pathVariable("name");
	                return ServerResponse.ok().body(myHandler.getCustomMessage(name), String.class);
	            })           
	            .POST("/message", (req) -> req.bodyToMono(String.class)
	                    .flatMap(message -> ServerResponse.ok().body(myHandler.postMessage(message), String.class)))
	            .build();
	    }
}
