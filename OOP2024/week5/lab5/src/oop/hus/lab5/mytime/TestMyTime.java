package oop.hus.lab5.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime time = new MyTime(12, 30, 45);
        System.out.println("Initial time: " + time);

        time.nextSecond();
        System.out.println("Next second: " + time);

        time.nextMinute();
        System.out.println("Next minute: " + time);

        time.nextHour();
        System.out.println("Next hour: " + time);

        time.previousSecond();
        System.out.println("Previous second: " + time);

        time.previousMinute();
        System.out.println("Previous minute: " + time);

        time.previousHour();
        System.out.println("Previous hour: " + time);
    }
}

