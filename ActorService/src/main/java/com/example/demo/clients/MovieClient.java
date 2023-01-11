package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Movie;

@FeignClient(name = "MovieService")
public interface MovieClient {

	@Retryable(maxAttempts = 3 )
	@GetMapping(value="/movie")
	Movie findMovieByName();
	
	
}
