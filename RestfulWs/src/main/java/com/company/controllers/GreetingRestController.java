package com.company.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.company.beans.Greeting;
import com.company.beans.Quote;

@RestController
public class GreetingRestController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World !!") String name) {
		
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		System.out.println("\n\n\nQuote : " + quote);
		
		return new Greeting(counter.getAndIncrement(), String.format(template, name));
	}
	
	
	
}
