package abstractClassesAndMethods;

import java.time.LocalDate;
import java.util.Arrays;

public class MovieDemo {
	public static void main(String[] args) {
		Movie actionMovie = new ActionMovie("Vikram", "Lokesh Kanagaraj", LocalDate.of(2022, 6, 3), 8.4, 174, Arrays.asList("Kamal Haasan", "Vijay Sethupathi", "Fahadh Faasil"));
		Movie comedyMovie = new ComedyMovie("Boss Engira Bhaskaran", "M. Rajesh", LocalDate.of(2010, 9, 10), 7.2, 160, Arrays.asList("Arya", "Nayanthara", "Santhanam"));
        actionMovie.displayMovieDetails();
        actionMovie.playTrailer();
        actionMovie.showReview();
        
        System.out.println();
        comedyMovie.displayMovieDetails();
        comedyMovie.playTrailer();
        comedyMovie.showReview();
      
        
    }
}
