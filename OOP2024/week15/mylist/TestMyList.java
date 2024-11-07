package hus.oop.mylist;

public class TestMyList {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        System.out.println("Testing MyArrayList:");
        MyList arrayList = new MyArrayList();
        arrayList.append(5.0);
        arrayList.append(10.0);
        arrayList.append(15.0);
        arrayList.append(20.0);
        System.out.println("Data in MyArrayList: " + arrayList.toString());

        BasicStatistic statistic = new BasicStatistic(arrayList);
        System.out.println("Maximum value: " + statistic.max());
        System.out.println("Minimum value: " + statistic.min());
        System.out.println("Mean value: " + statistic.mean());
        System.out.println("Variance value: " + statistic.variance());
        System.out.println();
    }

    public static void testMyLinkedList() {
        System.out.println("Testing MyLinkedList:");
        MyList linkedList = new MyLinkedList();
        linkedList.append(5.0);
        linkedList.append(10.0);
        linkedList.append(15.0);
        linkedList.append(20.0);
        System.out.println("Data in MyLinkedList: " + linkedList.toString());

        BasicStatistic statistic = new BasicStatistic(linkedList);
        System.out.println("Maximum value: " + statistic.max());
        System.out.println("Minimum value: " + statistic.min());
        System.out.println("Mean value: " + statistic.mean());
        System.out.println("Variance value: " + statistic.variance());
    }
}
