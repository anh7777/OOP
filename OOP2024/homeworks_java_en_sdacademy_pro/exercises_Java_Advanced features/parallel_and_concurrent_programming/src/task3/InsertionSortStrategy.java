package task3;

import java.util.concurrent.Callable;

class InsertionSortStrategy implements Callable<String> {
    private int[] array;
    public InsertionSortStrategy(int[] array) {
        this.array = array;
    }
    public void insertionSort() {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }
    @Override
    public String call() throws Exception {
        insertionSort();
        return "Insertion sort";
    }
}

