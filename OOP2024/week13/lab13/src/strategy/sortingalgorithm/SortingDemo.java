package strategy.sortingalgorithm;

public class SortingDemo {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        SortingContext context = new SortingContext();
        context.setAlgorithm(new BubbleSort());
        context.performSort(arr);
        context.printArray(arr);

        int[] arr1 = { 64, 34, 25, 12, 22, 11, 90 };
        SortingContext context1 = new SortingContext();
        context1.setAlgorithm(new InsertionSort());
        context1.performSort(arr1);
        context1.printArray(arr1);
    }
}
