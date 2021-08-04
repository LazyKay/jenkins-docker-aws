package com.sapient.trg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.sapient.trg.model.Greeting;

@RestController
@RequestMapping("/v1/docker")
public class HelloDocker {
	
	public ResponseEntity<Greeting> sayHello(){
		try {
			return new ResponseEntity<>(new Greeting("Hello Docker!"),HttpStatus.OK);
		}catch(ResponseStatusException e) {
			throw e;
		}
	}
}
