/*
* Movie.java
* Movie object has: firstName, lastName, movieTitle, movieRating, submitTime
* provides the object to movie_form.html and movie_show.html
*/

package com.example.cst438hw1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
  @Max(5)
  @Min(1)
  private int movieRating;

  @NotNull
  private String submitTime;

  //default constructor
  public Movie(){
    this.submitTime = new java.util.Date().toString();
  }

  //constructor
  public Movie(long id, String firstName, String lastName, String movieTitle,
      int movieRating, String submitTime){
    super();
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.movieTitle = movieTitle;
    this.movieRating = movieRating;
    this.submitTime = new java.util.Date().toString();
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

  public int getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(int movieRating) {
    this.movieRating = movieRating;
  }

  public String getSubmitTime() {
    return submitTime;
  }

  public void setSubmitTime(String submitTime) { this.submitTime = new java.util.Date().toString(); }
}
