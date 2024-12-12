package com.example.demo.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("Producer")
public interface RestConsumer {
	
	@GetMapping("/producer/msg") //this path should match with the producer application
	public ResponseEntity<String> producerMethod();

}
