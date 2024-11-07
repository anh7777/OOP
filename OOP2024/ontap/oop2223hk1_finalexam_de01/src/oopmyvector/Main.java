package oopmyvector;

public class Main {
    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);
        myVector.display();  // Output: 1 2 3

        myVector.remove(2);
        myVector.display();  // Output: 1 3
    }
}