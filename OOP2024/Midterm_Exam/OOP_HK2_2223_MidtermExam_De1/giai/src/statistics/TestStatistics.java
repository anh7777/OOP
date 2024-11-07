package statistics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        double[] data = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        double mean = Statistics.mean(data);
        double variance = Statistics.variance(data);
        double[] ranks = Statistics.rank(data);
        double median = Statistics.median(data);

        StringBuilder result = new StringBuilder();
        result.append("Data: ").append(Arrays.toString(data)).append("\n")
                .append("Mean: ").append(mean).append("\n")
                .append("Variance: ").append(variance).append("\n")
                .append("Ranks: ").append(Arrays.toString(ranks)).append("\n")
                .append("Median: ").append(median).append("\n");

        System.out.println(result.toString());

        try (FileWriter writer = new FileWriter("NguyenVanA_123456_Statistics.txt")) {
            writer.write(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
