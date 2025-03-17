package constructors;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private String director;
    private LocalDate releaseDate;
    private double rating;
    private int durationMinutes;
    private List<String> actors;

    // Constructor
    public Movie(String title, String genre, String director, LocalDate releaseDate, double rating, int durationMinutes, List<String> actors) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.actors = actors;
    }

    // Getters
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getDirector() { return director; }
    public LocalDate getReleaseDate() { return releaseDate; }
    public double getRating() { return rating; }
    public int getDurationMinutes() { return durationMinutes; }
    public List<String> getActors() { return actors; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setDirector(String director) { this.director = director; }
    public void setReleaseDate(LocalDate releaseDate) { this.releaseDate = releaseDate; }
    public void setRating(double rating) { this.rating = rating; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
    public void setActors(List<String> actors) { this.actors = actors; }

    // Display method
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Director: " + director);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Actors: " + String.join(", ", actors));
    }

    public static void main(String[] args) {
    	
        List<Movie> movieList = new ArrayList<>();
        
        List<String> actors1 = new ArrayList<>();
        actors1.add("Leonardo DiCaprio");
        actors1.add("Joseph Gordon-Levitt");
        actors1.add("Ellen Page");

        Movie movie1 = new Movie("Inception", "Sci-Fi", "Christopher Nolan", LocalDate.of(2010, 7, 16), 8.8, 148, actors1);

        List<String> actors2 = new ArrayList<>();
        actors2.add("Christian Bale");
        actors2.add("Heath Ledger");
        actors2.add("Aaron Eckhart");

        Movie movie2 = new Movie("The Dark Knight", "Action", "Christopher Nolan", LocalDate.of(2008, 7, 18), 9.0, 152, actors2);

        movieList.add(movie1);
        movieList.add(movie2);

        for (Movie movie : movieList) {
            movie.displayMovieDetails();
            System.out.println("-------------------------");
        }
    }
}

