package com.example.cst438hw1;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieRating {

  //looks for MovieRepository.java interface class
  @Autowired
  MovieRepository movieRepository;

  /*
  localhost:8080/movie/new
  presents the user the movie_form.html page to fill-out
   */
  @GetMapping("/movie/new")
  public String createMovie(Model model){
    Movie movie = new Movie();                              //new blank movie object
    model.addAttribute("movie", movie);       //key value = movie
    return "movie_form";                                   //movie_form.html is returned
  }

  /*
  localhost:8080/movie
  presents the user the movie_show.html page after submitting a new movie
   */
  @PostMapping("/movie")
  public String processMovieForm(@Valid Movie movie, BindingResult result, Model model){
    if (result.hasErrors()){                              //check for errors in form
      return "movie_form";                                //if errors return the form to the user
    }
    movieRepository.save(movie);                          //save to the database
    return "movie_show";                                  //no errors return movie_show.html
  }

  /*
  localhost:8080/movie
  presents the user the movie_list.html page, which contains a list of the movies in the database
   */
  @GetMapping("/movie")
  public String getAllMovies(Model model){
    Iterable<Movie> movie = movieRepository.findAll();    //create the list of movies
    model.addAttribute("movies", movie);
    return "movie_list";                                  //return movie_list.html
  }

}
