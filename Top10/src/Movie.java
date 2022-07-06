public class Movie {
    Integer movieRank;
    String title;
    String director;
    Integer rottenTomatoScore;
    public Movie(Integer movieRank, String title, String director, Integer rottenTomatoScore) {
        this.movieRank = movieRank;
        this.title = title;
        this.director = director;
        this.rottenTomatoScore = rottenTomatoScore;


        
    }
    public Integer getMovieRank() {
        return movieRank;
    }
    public void setMovieRank(Integer movieRank) {
        this.movieRank = movieRank;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Integer getRottenTomatoScore() {
        return rottenTomatoScore;
    }
    public void setRottenTomatoScore(Integer rottenTomatoScore) {
        this.rottenTomatoScore = rottenTomatoScore;


        
    }
    @Override
    public String toString() {
        return "Movie [director=" + director + ", movieRank=" + movieRank + ", rottenTomatoScore=" + rottenTomatoScore
                + ", title=" + title + "]";
    }

    
    
}
