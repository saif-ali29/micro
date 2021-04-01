package com.cognizant.MovieService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.MovieService.model.Movie;
import com.cognizant.MovieService.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;
	@GetMapping()
	public List<Movie> getMovieListAdmin() {
		
		return movieService.getMovieListAdmin();
	}
	@GetMapping("/customer")
	public List<Movie> getMenuItemListCustomer() {
		return movieService.getMovieListCustomer();
	}
	@GetMapping("/{id}")
	public Movie getMenuItem(@PathVariable long id){
		return movieService.getMovie(id);
	}
	@PutMapping
	public void modifyMenuItem(@RequestBody Movie movie) {
		movieService.modifyMovie(movie);
	}
}
