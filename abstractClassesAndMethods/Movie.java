package abstractClassesAndMethods;

import java.time.LocalDate;
import java.util.List;

public abstract class Movie {
    private String title;
    private String genre;
    private String director;
    private LocalDate releaseDate;
    private double rating;
    private int durationMinutes;
    private List<String> actors;
    
    public Movie(String title, String genre, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.actors = actors;
    }
    
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public String getDirector() {
        return director;
    }
    public LocalDate getReleaseDate() {
        return releaseDate;
    }
    public double getRating() {
        return rating;
    }
    public int getDurationMinutes() {
        return durationMinutes;
    }
    public List<String> getActors() {
        return actors;
    }
    
    public abstract void displayMovieDetails();
    public abstract String getMovieType();
    public abstract void playTrailer();
    public abstract void showReview();
}

// Child class ActionMovie
class ActionMovie extends Movie {
    public ActionMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        super(title, "Action", director, releaseDate, rating, durationMinutes, actors);
    }
    
    @Override
    public void displayMovieDetails() {
        System.out.println("Movie: " + getTitle() + " directed by " + getDirector());
    }
    
    @Override
    public String getMovieType() {
        return "Action Movie";
    }
    
    @Override
    public void playTrailer() {
        System.out.println("Playing trailer for action movie: " + getTitle());
    }
    
    @Override
    public void showReview() {
        System.out.println("Reviews for action movie: " + getTitle());
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        super(title, "Comedy", director, releaseDate, rating, durationMinutes, actors);
    }
    
    @Override
    public void displayMovieDetails() {
        System.out.println("Movie: " + getTitle() + " directed by " + getDirector());
    }
    
    @Override
    public String getMovieType() {
        return "Comedy Movie";
    }
    
    @Override
    public void playTrailer() {
        System.out.println("Playing trailer for comedy movie: " + getTitle());
    }
    
    @Override
    public void showReview() {
        System.out.println("Reviews for comedy movie: " + getTitle());
    }
}

