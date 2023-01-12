package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.Movie;

import io.github.resilience4j.retry.annotation.Retry;

@Retry(name = "MovieService")
@FeignClient(name = "MovieService")
public interface MovieClient {

//	@Retryable(maxAttempts = 1 )
	@GetMapping(value="/movie")
	Movie findMovieByName();
	
	
}
