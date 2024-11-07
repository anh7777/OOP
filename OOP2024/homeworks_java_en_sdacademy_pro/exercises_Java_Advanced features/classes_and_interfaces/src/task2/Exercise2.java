package task2;

public class Exercise2 {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator()
                .setTitle("Star Wars")
                .setDirector("J.J Abrams")
                .setGenre("Action")
                .setYearOfRelease(2015)
                .setPublisher("Disney")
                .createMovie();
        System.out.println(movie);
    }
}
