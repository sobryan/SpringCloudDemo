package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;
import com.example.demo.service.ActorService;

@RestController
public class ActorController {

	private final ActorService actorService;
	
	@Autowired
	public ActorController(ActorService actorService) {
		this.actorService = actorService;
	}
	
	@GetMapping("/actor")
	public Actor findActor(@RequestParam(value = "name") String name) {
		return actorService.findActorByName(name);
	}
	
	@GetMapping("/movie")
	public Movie findMovie(@RequestParam(value = "name") String name) {
		return actorService.findMovieByName(name);
	}
	
	
}
