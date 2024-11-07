package hus.oop.mylist;

import java.util.Random;

public class TestMyList {
    public static void main(String[] args) {
        /*
         * TODO
         * Chạy demo các hàm test.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyArrayList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Test MyArrayList");
        Random random = new Random();
        int length = random.nextInt(30, 50);
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < length; i++) {
            list.append(random.nextDouble(1, 20));
        }
        printMyArrayList(list);
    }

    public static void testMyLinkedList() {
        /*
         * TODO
         * Tạo ra một list kiểu MyLinkedList có các phần tử dữ liệu kiểu Double.
         * Sử dụng BasicStatistic để tính các đại lượng thống kê cơ bản (max, min, kỳ vọng, phương sai).
         * In ra terminal các thông tin về dữ liệu và các đại lượng thống kê.
         */
        System.out.println("Test MyLinkedList");
        Random random = new Random();
        int length = random.nextInt(30, 50);
        MyLinkedList list = new MyLinkedList();
        for (int i = 0; i < length; i++) {
            list.append(random.nextDouble(1, 20));
        }
        printMyArrayList(list);

    }

    public static void printMyArrayList(MyList list) {
        BasicStatistic statistic = new BasicStatistic(list);
        System.out.println("Maximum value: " + statistic.max());
        System.out.println("Minimum value: " + statistic.min());
        System.out.println("Mean value: " + statistic.mean());
        System.out.println("Variance value: " + statistic.variance());
        System.out.println();
    }
}
