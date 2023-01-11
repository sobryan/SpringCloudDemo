package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.clients.MovieClient;
import com.example.demo.domain.Actor;
import com.example.demo.domain.Movie;

@Service
public class ActorService {

	@Autowired
	MovieClient movieClient;
	
	public Actor findActorByName(String name) {
		return new Actor("Woody Harrelson");
	}

	public Movie findMovieByName(String name) {
		Movie movie = movieClient.findMovieByName();
		return movie;
	}

}
