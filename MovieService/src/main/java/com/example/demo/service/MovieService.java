package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import com.example.demo.domain.Movie;

@Service
public class MovieService {

	int counter = 0;
	
	@Autowired
	Environment env;
	
//	server.port=8003
//			spring.zipkin.service.name=MovieService
//			spring.application.name=MovieService
	public Movie findMovieByName() {
		counter++;
		if(counter==3) {
			counter=0;
			System.out.println("**************       Some error has occured     *****************");
			throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "Some error has occured");
		}
		String instance = env.getProperty("spring.application.name") + ":" + env.getProperty("server.port");
		return new Movie("Midway", instance);
	}

}
