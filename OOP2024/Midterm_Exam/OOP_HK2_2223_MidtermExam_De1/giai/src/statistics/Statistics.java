package statistics;

import java.util.Arrays;

public class Statistics {
    public static double mean(double[] data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    public static double variance(double[] data) {
        double mean = mean(data);
        double sum = 0;
        for (double num : data) {
            sum += Math.pow(num - mean, 2);
        }
        return sum / data.length;
    }

    public static double[] rank(double[] data) {
        int n = data.length;
        double[] ranks = new double[n];
        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Double.compare(data[a], data[b]));

        for (int i = 0; i < n; i++) {
            ranks[indices[i]] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            int start = i;
            while (i < n - 1 && data[indices[i]] == data[indices[i + 1]]) {
                i++;
            }
            double rankSum = 0;
            for (int j = start; j <= i; j++) {
                rankSum += ranks[indices[j]];
            }
            double avgRank = rankSum / (i - start + 1);
            for (int j = start; j <= i; j++) {
                ranks[indices[j]] = avgRank;
            }
        }

        return ranks;
    }

    public static double median(double[] data) {
        Arrays.sort(data);
        int n = data.length;
        if (n % 2 == 0) {
            return (data[n / 2 - 1] + data[n / 2]) / 2.0;
        } else {
            return data[n / 2];
        }
    }
}
