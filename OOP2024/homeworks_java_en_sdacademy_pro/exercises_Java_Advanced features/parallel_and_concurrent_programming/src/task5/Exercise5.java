package task5;

public class Exercise5 {
    public static void main(String[] args) {
        Iterator<Integer> iterator = new Iterator<Integer>(new
                Integer[]{1, 4, 50, 434, 78});
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int value = iterator.next();
                    System.out.println(Thread.currentThread().getName() + " " +
                            value);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int value = iterator.prev();
                    System.out.println(Thread.currentThread().getName() + " " +
                            value);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}

