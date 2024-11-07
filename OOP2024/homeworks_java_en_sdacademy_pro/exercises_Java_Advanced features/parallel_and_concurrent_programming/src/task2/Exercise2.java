package task2;

public class Exercise2 {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        Car car1 = new Car("VW", "Combi");
        Car car2 = new Car("SEAT", "Suv");
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bridge.driveThrough(car2);
            }
        });
        thread1.start();
        thread2.start();
    }
}

