package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        UserParser userParser = new UserParser();
        Path path =
                Paths.get("/Users/sdauser/Documents/sda/code/test.txt");
        List<User> users = new ArrayList<>();
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            User user = userParser.fromCSV(line);
            users.add(user);
        }
        System.out.println("Results " + users);
    }
}

