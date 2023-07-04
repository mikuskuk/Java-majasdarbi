package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int count = 0;

        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[count] = movie;
                count++;
            }
        }

        Movie[] pgMoviesFiltered = new Movie[count];
        System.arraycopy(pgMovies, 0, pgMoviesFiltered, 0, count);

        return pgMoviesFiltered;
    }
}
