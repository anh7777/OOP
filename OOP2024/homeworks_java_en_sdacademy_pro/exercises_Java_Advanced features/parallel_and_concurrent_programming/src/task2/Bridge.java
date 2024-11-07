package task2;

class Bridge {
    public synchronized void driveThrough(Car car) {
        System.out.println("Driving through: " + car);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished!: " + car);
    }
}

