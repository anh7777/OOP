package oop.hus.lab5.mydate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date = new MyDate(2011, 12, 28);

        for (int i = 0; i < 65; i++) {
            System.out.println(date.nextDay());
        }
    }
}

