package com.sortstrategy;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        /* TODO */
        Random random = new Random();
        int n = random.nextInt(10, 21);
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = random.nextInt(0, n * 2);
        }

        SortStrategy sortStrategy = SortStrategy.getInstance();
        String result = "";

        // bubble sort
        sortStrategy.setSortee(new BubbleSort());
        int[] arr = original.clone();
        result += "Using Bubble Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        int numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps + "\n\n";

        // selection sort
        sortStrategy.setSortee(new SelectionSort());
        arr = original.clone();
        result += "Using Selection Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps + "\n\n";

        // insertion sort
        sortStrategy.setSortee(new InsertionSort());
        arr = original.clone();
        result += "Using Insertion Sort Algorithm:\nBefore sorting: " + Arrays.toString(arr) + "\nAfter sorting: ";
        numberOfSwaps = sortStrategy.sort(arr);
        result += Arrays.toString(arr) + "\nNumber of swap: " + numberOfSwaps;

        System.out.println(result);

        // Kết quả chạy chương trình lưu vào file SortStrategy<Mã sinh viên>.txt và nộp cùng source code.

        try {
            FileWriter fileWriter = new FileWriter("SortStrategy21002158.txt");
            fileWriter.write(result);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Can't write to file!");
            e.printStackTrace();
        }
    }
}
