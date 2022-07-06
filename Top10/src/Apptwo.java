import java.util.ArrayList;
import java.util.Scanner;
public class Apptwo {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter top 10 film");


        ArrayList<Movie> top10 = new ArrayList<Movie>();

        top10.add( new Movie( 1, "MARCEL THE SHELL WITH SHOES ON", "Dean Fleischer-Camp", 100));
        top10.add( new Movie( 2, "FIRE OF LOVE", "Sara Dosa", 100));
        top10.add( new Movie( 3, "PLAYGROUND", "Laura Wandel", 100));
        top10.add( new Movie( 4, "The Godfather", "Francis Ford Coppola", 100));
        top10.add( new Movie( 5, "The Godfather", "Francis Ford Coppola", 100));
        top10.add( new Movie( 6, "MARCEL THE SHELL WITH SHOES ON", "Dean Fleischer-Camp", 100));
        top10.add( new Movie( 7, "FIRE OF LOVE", "Sara Dosa", 100));
        top10.add( new Movie( 8, "PLAYGROUND", "Laura Wandel", 100));
        top10.add( new Movie( 9, "The Godfather", "Francis Ford Coppola", 100));
        top10.add( new Movie( 10, "The Godfather", "Francis Ford Coppola", 100));

        System.out.print("Choose a Film by top 10 > ");
        Scanner scanner = new Scanner(System.in);

        String response = scanner.nextLine();
        Integer selectedMovie = Integer.parseInt(response);

        for(Movie movie:top10){
            if(movie.movieRank == selectedMovie){
                System.out.println("You selected >>> " + movie.title + " by " + movie.director + " with a rotten tomatos score of " + movie.rottenTomatoScore);
            }
        }


    }
}





    

