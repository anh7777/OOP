package strategy.sortingalgorithm;

public class SortingContext {
    private SortingAlgorithm algorithm;

    public void setAlgorithm(SortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void performSort(int[] arr) {
        algorithm.sort(arr);
    }
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);
    }
}
