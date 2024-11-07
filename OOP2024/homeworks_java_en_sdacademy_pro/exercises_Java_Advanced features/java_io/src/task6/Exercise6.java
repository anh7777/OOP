package task6;

import java.io.IOException;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        MovieFileRepository movieFileRepository = new MovieFileRepository();
        movieFileRepository.add(new Movie("Star Wars Force Awaken", "Action", "J.J Ambrams", 2015));
        movieFileRepository.add(new Movie("Star Wars Last Jedi", "Action", "J.J Ambrams", 2017));
        System.out.println("Results :" + movieFileRepository.getAll());
    }
}

