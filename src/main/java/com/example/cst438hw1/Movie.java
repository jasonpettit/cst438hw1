/*
* Movie.java
* Movie object has: firstName, lastName, movieTitle, movieRating
* provides the object to movie_form.html and movie_show.html
*/

package com.example.cst438hw1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {

  @Id
  @GeneratedValue
  private long id;

  @NotNull
  @Size(min=3, max=25)
  private String firstName;

  @NotNull
  @Size(min=3, max=25)
  private String lastName;

  @NotNull
  @Size(min=3, max=50)
  private String movieTitle;

  @NotNull
  @Size(min=1, max=1)
  private String movieRating;

  private String time;

  //default constructor
  public Movie(){}

  //constructor
  public Movie(long id, String firstName, String lastName, String movieTitle,
      String movieRating, String time){
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.movieTitle = movieTitle;
    this.movieRating = movieRating;
    this.time = new java.util.Date().toString();
  }

  //getters and setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public String getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(String movieRating) {
    this.movieRating = movieRating;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = new java.util.Date().toString();
  }
}
