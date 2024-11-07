package task6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

class MovieFileRepository {
    private final MovieParser movieParser = new MovieParser();
    private final static Path PATH =
            Paths.get("/Users/sdauser/Documents/sda/code/test.txt");
    public void add(Movie movie) throws IOException {
        Files.writeString(PATH, movieParser.toCSV(movie), StandardOpenOption.APPEND);
    }
    public List<Movie> getAll() throws IOException {
        List<String> movieLines = Files.readAllLines(PATH);
        List<Movie> movies = new ArrayList<>();
        for (String line : movieLines) {
            Movie movie = movieParser.fromCSV(line);
            movies.add(movie);
        }
        return movies;
    }
}

