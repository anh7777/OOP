package hus.com.mylist;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyArrayList<>();
        MyList<Integer> linkedList = new MyLinkedList<>();

        // Add 10 elements to each list
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Print both lists
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // Remove elements from both lists and print after each removal
        arrayList.remove(2);
        linkedList.remove(2);
        System.out.println("ArrayList after removing index 2: " + arrayList);
        System.out.println("LinkedList after removing index 2: " + linkedList);

        arrayList.remove(5);
        linkedList.remove(5);
        System.out.println("ArrayList after removing index 5: " + arrayList);
        System.out.println("LinkedList after removing index 5: " + linkedList);

        // Get elements from both lists
        System.out.println("Element at index 3 in ArrayList: " + arrayList.get(3));
        System.out.println("Element at index 3 in LinkedList: " + linkedList.get(3));

        // Check sizes
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());
    }
}

